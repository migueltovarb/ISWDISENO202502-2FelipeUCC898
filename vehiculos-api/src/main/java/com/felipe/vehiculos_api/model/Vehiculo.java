package com.felipe.vehiculos_api.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;

@Document(collection = "vehiculos")
@Data //genera getters y setters
@NoArgsConstructor // Genera el constructor Vacio requerido por spring data
@AllArgsConstructor // Genera un constructor con todos los atributos
@Builder //Permite crear objetos asi: 
// Vehiculo v = Vehiculo.builder()
//.modelo("Mazda 3")
//.marca("Mazda")
//.placa("ABC123")
//.precio(25000.0)
//.tipoVehiculo(TipoVehiculo.CARRO)
//.build();
public class Vehiculo {

    @Id
    private String id;

    private String modelo;
    private String placa;
    private String marca;
    private double precio;
    private TipoVehiculo tipoVehiculo;
    
}
