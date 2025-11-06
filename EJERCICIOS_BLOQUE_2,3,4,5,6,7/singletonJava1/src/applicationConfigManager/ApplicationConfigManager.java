package applicationConfigManager;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Sistema de gestión de configuración que utiliza el patrón Singleton
 * para garantizar acceso consistente a la configuración en toda la aplicación
 */
public class ApplicationConfigManager {
    
    // Instancia única del Singleton (implementación thread-safe con inicialización eager)
    private static final ApplicationConfigManager INSTANCE = new ApplicationConfigManager();
    
    private Properties configProperties;
    private Map<String, Long> lastModifiedTimestamps;
    private boolean configLoaded;
    private String configFilePath;
    
    // Constructor privado para prevenir instanciación externa
    private ApplicationConfigManager() {
        this.configProperties = new Properties();
        this.lastModifiedTimestamps = new HashMap<>();
        this.configLoaded = false;
        this.configFilePath = "application.properties"; // Ruta por defecto
        
        // Cargar configuración inicial
        loadConfiguration();
    }
    
    /**
     * Método estático para obtener la instancia única
     */
    public static ApplicationConfigManager getInstance() {
        return INSTANCE;
    }
    
    /**
     * Cargar configuración desde archivo
     */
    private synchronized void loadConfiguration() {
        try (FileInputStream fis = new FileInputStream(configFilePath)) {
            configProperties.load(fis);
            configLoaded = true;
            lastModifiedTimestamps.put(configFilePath, System.currentTimeMillis());
            System.out.println("Configuración cargada exitosamente desde: " + configFilePath);
        } catch (IOException e) {
            System.err.println("Error al cargar configuración: " + e.getMessage());
            // Usar valores por defecto
            setDefaultConfiguration();
        }
    }
    
    /**
     * Configuración por defecto en caso de error
     */
    private void setDefaultConfiguration() {
        configProperties.setProperty("database.url", "jdbc:mysql://localhost:3306/mydb");
        configProperties.setProperty("database.user", "admin");
        configProperties.setProperty("database.password", "password");
        configProperties.setProperty("app.timeout", "30000");
        configProperties.setProperty("app.max_connections", "10");
        configProperties.setProperty("app.debug_mode", "false");
        configLoaded = true;
        System.out.println("Usando configuración por defecto");
    }
    
    /**
     * Verificar si la configuración ha sido modificada externamente
     */
    public synchronized boolean isConfigModified() {
        try {
            Long lastModified = lastModifiedTimestamps.get(configFilePath);
            java.io.File configFile = new java.io.File(configFilePath);
            return configFile.exists() && configFile.lastModified() > lastModified;
        } catch (Exception e) {
            return false;
        }
    }
    
    /**
     * Recargar configuración si ha sido modificada
     */
    public synchronized void reloadIfModified() {
        if (isConfigModified()) {
            System.out.println("Configuración modificada, recargando...");
            loadConfiguration();
        }
    }
    
    /**
     * Obtener valor de configuración como String
     */
    public String getString(String key) {
        reloadIfModified();
        return configProperties.getProperty(key);
    }
    
    /**
     * Obtener valor de configuración como entero
     */
    public int getInt(String key) {
        try {
            return Integer.parseInt(getString(key));
        } catch (NumberFormatException e) {
            throw new ConfigurationException("Valor no numérico para la clave: " + key, e);
        }
    }
    
    /**
     * Obtener valor de configuración como booleano
     */
    public boolean getBoolean(String key) {
        return Boolean.parseBoolean(getString(key));
    }
    
    /**
     * Cambiar la ruta del archivo de configuración
     */
    public synchronized void setConfigFilePath(String filePath) {
        this.configFilePath = filePath;
        loadConfiguration();
    }
    
    /**
     * Establecer un valor de configuración temporalmente (en memoria)
     */
    public synchronized void setTemporaryConfig(String key, String value) {
        configProperties.setProperty(key, value);
    }
    
    /**
     * Verificar si la configuración está cargada correctamente
     */
    public boolean isConfigLoaded() {
        return configLoaded;
    }
    
    /**
     * Obtener todas las configuraciones (útil para debugging)
     */
    public synchronized Properties getAllConfigurations() {
        return new Properties(configProperties); // Retorna una copia
    }
    
    /**
     * Excepción personalizada para errores de configuración
     */
    public static class ConfigurationException extends RuntimeException {
        public ConfigurationException(String message) {
            super(message);
        }
        
        public ConfigurationException(String message, Throwable cause) {
            super(message, cause);
        }
    }
}

/**
 * Clase de demostración que simula diferentes componentes de una aplicación
 * que necesitan acceder a la configuración compartida
 */
public class SingletonPatternDemo {
    
    // Simulación de diferentes servicios que necesitan la configuración
    static class DatabaseService {
        public void connect() {
            ApplicationConfigManager config = ApplicationConfigManager.getInstance();
            String url = config.getString("database.url");
            String user = config.getString("database.user");
            
            System.out.println("DatabaseService conectando a: " + url + " como " + user);
            System.out.println("Timeout configurado: " + config.getInt("app.timeout") + "ms");
        }
    }
    
    static class APIService {
        public void initialize() {
            ApplicationConfigManager config = ApplicationConfigManager.getInstance();
            int maxConnections = config.getInt("app.max_connections");
            boolean debugMode = config.getBoolean("app.debug_mode");
            
            System.out.println("APIService inicializado con " + maxConnections + " conexiones máximas");
            System.out.println("Modo debug: " + (debugMode ? "ACTIVADO" : "DESACTIVADO"));
        }
    }
    
    static class CacheService {
        public void setup() {
            ApplicationConfigManager config = ApplicationConfigManager.getInstance();
            // Usando un valor por defecto si la clave no existe
            String cacheSize = config.getString("app.cache_size");
            if (cacheSize == null) {
                cacheSize = "100MB";
                config.setTemporaryConfig("app.cache_size", cacheSize);
            }
            
            System.out.println("CacheService configurado con tamaño: " + cacheSize);
        }
    }
    
    public static void main(String[] args) {
        System.out.println("=== DEMOSTRACIÓN PATRÓN SINGLETON ===");
        System.out.println();
        
        // Obtener la instancia Singleton
        ApplicationConfigManager configManager = ApplicationConfigManager.getInstance();
        
        // Demostrar que siempre obtenemos la misma instancia
        ApplicationConfigManager anotherReference = ApplicationConfigManager.getInstance();
        System.out.println("¿Misma instancia? " + (configManager == anotherReference));
        System.out.println();
        
        // Simular diferentes servicios usando la misma configuración
        DatabaseService dbService = new DatabaseService();
        APIService apiService = new APIService();
        CacheService cacheService = new CacheService();
        
        System.out.println("--- Inicializando servicios ---");
        dbService.connect();
        apiService.initialize();
        cacheService.setup();
        
        System.out.println();
        System.out.println("--- Mostrando configuración completa ---");
        configManager.getAllConfigurations().forEach((key, value) -> 
            System.out.println(key + " = " + value)
        );
        
        System.out.println();
        System.out.println("--- Demostrando modificación en caliente ---");
        // Cambiar un valor temporalmente
        configManager.setTemporaryConfig("app.debug_mode", "true");
        System.out.println("Debug mode después de modificación: " + 
            configManager.getBoolean("app.debug_mode"));
        
        System.out.println();
        System.out.println("=== DEMOSTRACIÓN COMPLETADA ===");
    }
}

/**
 * Archivo application.properties de ejemplo para probar:
 * 
 * database.url=jdbc:mysql://production-db:3306/myapp
 * database.user=production_user
 * database.password=secret123
 * app.timeout=45000
 * app.max_connections=20
 * app.debug_mode=true
 * app.cache_size=256MB
 */