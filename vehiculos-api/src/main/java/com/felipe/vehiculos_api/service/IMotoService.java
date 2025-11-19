package com.felipe.vehiculos_api.service;

import com.felipe.vehiculos_api.model.Moto;
import java.util.List;


public interface IMotoService {

    Moto crearMoto(Moto moto);

    Moto actualizarMoto(Moto moto);

    void eliminarMoto(String id);

    List<Moto> listarMotos();

    Moto obtenerMotoById(String id);

    Moto obtenerMotoByPlaca(String placa);

}
