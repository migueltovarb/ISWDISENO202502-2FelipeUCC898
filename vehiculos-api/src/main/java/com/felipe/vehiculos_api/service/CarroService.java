package com.felipe.vehiculos_api.service;

import com.felipe.vehiculos_api.model.Carro;
import com.felipe.vehiculos_api.repository.carroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CarroService implements ICarroService {

    @Autowired
    private carroRepository carroRepository;

    @Override
    public Carro obtenerCarroById(String id) {
        Optional<Carro> carro = carroRepository.findById(id);
        return carro.orElse(null);
    }

    @Override
    public Carro obtenerCarroByPlaca(String placa) {
        Optional<Carro> carro = carroRepository.findAll()
                                               .stream()
                                               .filter(c -> placa.equals(c.getPlaca()))
                                               .findFirst();
        return carro.orElse(null);
    }

    @Override
    public Carro crearCarro(Carro carro) {
        // Si el carro tiene ID, verificar si ya existe
        if (carro.getId() != null && !carro.getId().isEmpty()) {
            Optional<Carro> carroDb = this.carroRepository.findById(carro.getId());
            if (carroDb.isPresent()) {
                Carro carroActualizado = carroDb.get();
                carroActualizado.setModelo(carro.getModelo());
                carroActualizado.setPlaca(carro.getPlaca());
                carroActualizado.setMarca(carro.getMarca());
                carroActualizado.setPrecio(carro.getPrecio());
                carroActualizado.setTipoVehiculo(carro.getTipoVehiculo());
                carroActualizado.setCantidadSillas(carro.getCantidadSillas());
                return this.carroRepository.save(carroActualizado);
            }
        }
        // Si no tiene ID o no existe, crear uno nuevo
        return this.carroRepository.save(carro);
    }

    @Override
    public Carro actualizarCarro(Carro carro) {
        if (carro.getId() == null || carro.getId().isEmpty()) {
            throw new RuntimeException("El ID del carro es requerido para actualizar");
        }
        Optional<Carro> carroDb = this.carroRepository.findById(carro.getId());
        if (carroDb.isPresent()) {
            Carro carroActualizado = carroDb.get();
            carroActualizado.setModelo(carro.getModelo());
            carroActualizado.setPlaca(carro.getPlaca());
            carroActualizado.setMarca(carro.getMarca());
            carroActualizado.setPrecio(carro.getPrecio());
            carroActualizado.setTipoVehiculo(carro.getTipoVehiculo());
            carroActualizado.setCantidadSillas(carro.getCantidadSillas());
            return this.carroRepository.save(carroActualizado);
        }
        throw new RuntimeException("Carro no encontrado con ID: " + carro.getId());
    }

    @Override
    public void eliminarCarro(String id) {
        Optional<Carro> carro = carroRepository.findById(id);
        if (carro.isPresent()) {
            this.carroRepository.delete(carro.get());
        } else {
            throw new RuntimeException("Carro no encontrado");
        }
    }

    @Override
    public List<Carro> listarCarros() {
        return carroRepository.findAll();
    }
    
}
