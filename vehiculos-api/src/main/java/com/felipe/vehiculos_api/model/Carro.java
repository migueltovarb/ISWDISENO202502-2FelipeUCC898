package com.felipe.vehiculos_api.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "vehiculos")
public class Carro extends Vehiculo {

    private int cantidadSillas;

    public Carro() {
        super();
    }

    public Carro(String id, String modelo, String placa, String marca, double precio, TipoVehiculo tipoVehiculo, int cantidadSillas) {
        super(id, modelo, placa, marca, precio, tipoVehiculo);
        this.cantidadSillas = cantidadSillas;
    }

    public int getCantidadSillas() {
        return cantidadSillas;
    }

    public void setCantidadSillas(int cantidadSillas) {
        this.cantidadSillas = cantidadSillas;
    }
}
