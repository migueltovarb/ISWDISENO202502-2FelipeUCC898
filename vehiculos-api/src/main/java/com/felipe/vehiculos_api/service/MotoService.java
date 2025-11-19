package com.felipe.vehiculos_api.service;

import com.felipe.vehiculos_api.model.Moto;
import com.felipe.vehiculos_api.repository.MotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class MotoService implements IMotoService {

    @Autowired
    private MotoRepository motoRepository;

    @Override
    public Moto obtenerMotoById(String id) {
        Optional<Moto> moto = motoRepository.findById(id);
        return moto.orElse(null);
    }

    @Override
    public Moto obtenerMotoByPlaca(String placa) {
        Optional<Moto> moto = motoRepository.findAll()
                                               .stream()
                                               .filter(m -> placa.equals(m.getPlaca()))
                                               .findFirst();
        return moto.orElse(null);
    }

    @Override
    public Moto crearMoto(Moto moto) {
        // Si la moto tiene ID, verificar si ya existe
        if (moto.getId() != null && !moto.getId().isEmpty()) {
            Optional<Moto> motoDb = this.motoRepository.findById(moto.getId());
            if (motoDb.isPresent()) {
                Moto motoActualizado = motoDb.get();
                motoActualizado.setModelo(moto.getModelo());
                motoActualizado.setPlaca(moto.getPlaca());
                motoActualizado.setMarca(moto.getMarca());
                motoActualizado.setPrecio(moto.getPrecio());
                motoActualizado.setTipoVehiculo(moto.getTipoVehiculo());
                return this.motoRepository.save(motoActualizado);
            }
        }
        // Si no tiene ID o no existe, crear una nueva
        return this.motoRepository.save(moto);
    }

    @Override
    public Moto actualizarMoto(Moto moto) {
        if (moto.getId() == null || moto.getId().isEmpty()) {
            throw new RuntimeException("El ID de la moto es requerido para actualizar");
        }
        Optional<Moto> motoDb = this.motoRepository.findById(moto.getId());
        if (motoDb.isPresent()) {
            Moto motoActualizado = motoDb.get();
            motoActualizado.setModelo(moto.getModelo());
            motoActualizado.setPlaca(moto.getPlaca());
            motoActualizado.setMarca(moto.getMarca());
            motoActualizado.setPrecio(moto.getPrecio());
            motoActualizado.setTipoVehiculo(moto.getTipoVehiculo());
            return motoRepository.save(motoActualizado);
        }
        throw new RuntimeException("Moto no encontrada con ID: " + moto.getId());
    }

    @Override
    public void eliminarMoto(String id) {
        Optional<Moto> moto = motoRepository.findById(id);
        if (moto.isPresent()) {
            this.motoRepository.delete(moto.get());
        } else {
            throw new RuntimeException("Moto no encontrada");
        }
    }

    @Override
    public List<Moto> listarMotos() {
        return motoRepository.findAll();
    }

}