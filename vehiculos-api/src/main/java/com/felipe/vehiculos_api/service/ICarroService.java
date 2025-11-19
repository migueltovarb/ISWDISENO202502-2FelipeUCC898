package com.felipe.vehiculos_api.service;

import com.felipe.vehiculos_api.model.Carro;
import java.util.List;

public interface ICarroService {

    Carro crearCarro(Carro carro);

    Carro actualizarCarro(Carro carro);

    void eliminarCarro(String id);

    List<Carro> listarCarros();

    Carro obtenerCarroById(String id);

    Carro obtenerCarroByPlaca(String placa);
}
