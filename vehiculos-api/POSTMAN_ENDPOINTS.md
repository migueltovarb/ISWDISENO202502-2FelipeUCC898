# Endpoints para Postman - Vehículos API

**Base URL:** `http://localhost:8080`

---

## 🚗 ENDPOINTS DE CARROS

### 1. Crear Carro
**Método:** `POST`  
**URL:** `http://localhost:8080/api/carros/crear-carro`  
**Headers:** 
```
Content-Type: application/json
```
**Body (raw JSON):**
```json
{
  "modelo": "Mazda 3",
  "placa": "ABC123",
  "marca": "Mazda",
  "precio": 25000.0,
  "tipoVehiculo": "DEPORTIVO",
  "cantidadSillas": 5
}
```
**Nota:** No incluyas el campo `id` al crear un nuevo carro. MongoDB lo generará automáticamente.

---

### 2. Listar Todos los Carros
**Método:** `GET`  
**URL:** `http://localhost:8080/api/carros/listar-carros`  
**Headers:** (ninguno necesario)  
**Body:** (ninguno)

---

### 3. Obtener Carro por ID
**Método:** `GET`  
**URL:** `http://localhost:8080/api/carros/obtener-carro/{id}`  
**Ejemplo:** `http://localhost:8080/api/carros/obtener-carro/678a1b2c3d4e5f6g7h8i9j0`  
**Headers:** (ninguno necesario)  
**Body:** (ninguno)

---

### 4. Obtener Carro por Placa
**Método:** `GET`  
**URL:** `http://localhost:8080/api/carros/obtener-carro-by-placa/{placa}`  
**Ejemplo:** `http://localhost:8080/api/carros/obtener-carro-by-placa/ABC123`  
**Headers:** (ninguno necesario)  
**Body:** (ninguno)

---

### 5. Actualizar Carro
**Método:** `PUT`  
**URL:** `http://localhost:8080/api/carros/actualizar-carro/{id}`  
**Ejemplo:** `http://localhost:8080/api/carros/actualizar-carro/678a1b2c3d4e5f6g7h8i9j0`  
**Headers:** 
```
Content-Type: application/json
```
**Body (raw JSON):**
```json
{
  "id": "678a1b2c3d4e5f6g7h8i9j0",
  "modelo": "Mazda 3 2024",
  "placa": "ABC123",
  "marca": "Mazda",
  "precio": 28000.0,
  "tipoVehiculo": "DEPORTIVO",
  "cantidadSillas": 5
}
```

---

### 6. Eliminar Carro
**Método:** `DELETE`  
**URL:** `http://localhost:8080/api/carros/eliminar-carro/{id}`  
**Ejemplo:** `http://localhost:8080/api/carros/eliminar-carro/678a1b2c3d4e5f6g7h8i9j0`  
**Headers:** (ninguno necesario)  
**Body:** (ninguno)

---

## 🏍️ ENDPOINTS DE MOTOS

### 1. Crear Moto
**Método:** `POST`  
**URL:** `http://localhost:8080/api/motos/crear-moto`  
**Headers:** 
```
Content-Type: application/json
```
**Body (raw JSON):**
```json
{
  "modelo": "CBR 600",
  "placa": "XYZ789",
  "marca": "Honda",
  "precio": 12000.0,
  "tipoVehiculo": "DEPORTIVO"
}
```
**Nota:** No incluyas el campo `id` al crear una nueva moto. MongoDB lo generará automáticamente.

---

### 2. Listar Todas las Motos
**Método:** `GET`  
**URL:** `http://localhost:8080/api/motos/listar-motos`  
**Headers:** (ninguno necesario)  
**Body:** (ninguno)

---

### 3. Obtener Moto por ID
**Método:** `GET`  
**URL:** `http://localhost:8080/api/motos/obtener-moto/{id}`  
**Ejemplo:** `http://localhost:8080/api/motos/obtener-moto/678a1b2c3d4e5f6g7h8i9j0`  
**Headers:** (ninguno necesario)  
**Body:** (ninguno)

---

### 4. Obtener Moto por Placa
**Método:** `GET`  
**URL:** `http://localhost:8080/api/motos/obtener-moto-by-placa/{placa}`  
**Ejemplo:** `http://localhost:8080/api/motos/obtener-moto-by-placa/XYZ789`  
**Headers:** (ninguno necesario)  
**Body:** (ninguno)

---

### 5. Actualizar Moto
**Método:** `PUT`  
**URL:** `http://localhost:8080/api/motos/actualizar-moto/{id}`  
**Ejemplo:** `http://localhost:8080/api/motos/actualizar-moto/678a1b2c3d4e5f6g7h8i9j0`  
**Headers:** 
```
Content-Type: application/json
```
**Body (raw JSON):**
```json
{
  "id": "678a1b2c3d4e5f6g7h8i9j0",
  "modelo": "CBR 650",
  "placa": "XYZ789",
  "marca": "Honda",
  "precio": 13500.0,
  "tipoVehiculo": "DEPORTIVO"
}
```

---

### 6. Eliminar Moto
**Método:** `DELETE`  
**URL:** `http://localhost:8080/api/motos/eliminar-moto/{id}`  
**Ejemplo:** `http://localhost:8080/api/motos/eliminar-moto/678a1b2c3d4e5f6g7h8i9j0`  
**Headers:** (ninguno necesario)  
**Body:** (ninguno)

---

## 📝 NOTAS IMPORTANTES

### Valores válidos para `tipoVehiculo`:
- `DEPORTIVO`
- `PICKUP`
- `TAXI`

### Para Carros:
- El campo `cantidadSillas` es obligatorio y debe ser un número entero.

### Para Motos:
- No requiere el campo `cantidadSillas`.

### IDs en MongoDB:
- Los IDs son generados automáticamente por MongoDB cuando creas un nuevo vehículo.
- Para actualizar o eliminar, necesitas usar el ID que recibes al crear el vehículo.
- Los IDs tienen formato: `678a1b2c3d4e5f6g7h8i9j0` (24 caracteres hexadecimales).

### Orden recomendado para probar:
1. **Crear** un carro o moto (POST)
2. **Listar** todos los vehículos (GET)
3. **Obtener** por ID o placa (GET)
4. **Actualizar** un vehículo (PUT)
5. **Eliminar** un vehículo (DELETE)

---

## 🔧 CONFIGURACIÓN EN POSTMAN

1. **Crear una nueva Collection** llamada "Vehículos API"
2. **Crear carpetas** para "Carros" y "Motos"
3. **Para cada endpoint:**
   - Seleccionar el método HTTP correcto
   - Pegar la URL completa
   - En la pestaña "Headers", agregar `Content-Type: application/json` (solo para POST y PUT)
   - En la pestaña "Body", seleccionar "raw" y "JSON", luego pegar el body correspondiente
4. **Guardar** cada request con un nombre descriptivo

