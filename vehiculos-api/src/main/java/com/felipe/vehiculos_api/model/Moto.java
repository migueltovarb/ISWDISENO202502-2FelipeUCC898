package com.felipe.vehiculos_api.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "vehiculos")
public class Moto extends Vehiculo {

    public Moto() {
        super();
    }

    public Moto(String id, String modelo, String placa, String marca, double precio, TipoVehiculo tipoVehiculo) {
        super(id, modelo, placa, marca, precio, tipoVehiculo);
    }
}
