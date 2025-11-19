package com.felipe.vehiculos_api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import com.felipe.vehiculos_api.service.ICarroService;
import com.felipe.vehiculos_api.model.Carro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;



@RestController 
@RequestMapping("/api/carros")
@CrossOrigin(origins = "http://localhost:3000") 
public class CarroController {

    @Autowired
    private ICarroService carroService;

    @PostMapping("/crear-carro")
    public ResponseEntity<Carro> crearCarro(@RequestBody Carro carro) {
        Carro nuevoCarro = carro;
        return ResponseEntity.ok(carroService.crearCarro(nuevoCarro));
    }

    @PutMapping("/actualizar-carro/{id}")
    public ResponseEntity<Carro> actualizarCarro(@PathVariable String id, @RequestBody Carro carro) {
        Carro carroActualizado = carroService.actualizarCarro(carro);
        return ResponseEntity.ok(carroActualizado);
    }

    @DeleteMapping("/eliminar-carro/{id}")
    public ResponseEntity<Void> eliminarCarro(@PathVariable String id) {
        this.carroService.eliminarCarro(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/listar-carros")
    public ResponseEntity<List<Carro>> listarCarros() {
        List<Carro> carros = carroService.listarCarros();
        return ResponseEntity.ok(carros);
    }

    @GetMapping("/obtener-carro/{id}")
    public ResponseEntity<Carro> obtenerCarroById(@PathVariable String id) {
        Carro carro = carroService.obtenerCarroById(id);
        return ResponseEntity.ok(carro);
    }

    @GetMapping("/obtener-carro-by-placa/{placa}")
    public ResponseEntity<Carro> obtenerCarroByPlaca(@PathVariable String placa) {
        Carro carro = carroService.obtenerCarroByPlaca(placa);
        return ResponseEntity.ok(carro);
    }
    
}
