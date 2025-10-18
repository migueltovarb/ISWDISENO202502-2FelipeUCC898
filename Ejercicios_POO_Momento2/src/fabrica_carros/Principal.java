package fabrica_carros;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    
    public static void main (String [] args ) {
        
        Fabrica chevrolet = new Fabrica();
        
        List<Planta> listaPlantas = new ArrayList<Planta>();
        
        // ---- Planta Pasto ----
        Llanta llantaPasto = new Llanta(17f, "Pista");
        Chasis chasisPasto = new Chasis(500f, Material.ACERO);
        Color colorPasto = Color.AZUL;
        
        Planta plantaPasto = new Planta(
            llantaPasto,
            chasisPasto,
            colorPasto
        );
        
        listaPlantas.add(plantaPasto);
        
        // ---- Planta Ipiales ----
        Llanta llantaIpiales = new Llanta(15f, "Todo terreno");
        Chasis chasisIpiales = new Chasis(550f, Material.ALUMINIO);
        Color colorIpiales = Color.AMARILLO;
        
        Planta plantaIpiales = new Planta(
            llantaIpiales,
            chasisIpiales,
            colorIpiales
        );
        
        listaPlantas.add(plantaIpiales);
        
        // ---- Simulación de fabricación ----
        for(int i = 1; i <= 100; i++) {
            Carro nuevoCarroPasto = plantaPasto.fabricar();
            System.out.println("Pasto fabricó: " + nuevoCarroPasto);
            
            Carro nuevoCarroIpiales = plantaIpiales.fabricar();
            System.out.println("Ipiales fabricó: " + nuevoCarroIpiales);
        }
    }
}
