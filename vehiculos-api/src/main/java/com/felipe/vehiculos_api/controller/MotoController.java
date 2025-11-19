package com.felipe.vehiculos_api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import com.felipe.vehiculos_api.service.IMotoService;
import com.felipe.vehiculos_api.model.Moto;
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
@RequestMapping("/api/motos")
@CrossOrigin(origins = "http://localhost:3000") 
public class MotoController {

    @Autowired
    private IMotoService motoService;


    @PostMapping("/crear-moto")
    public ResponseEntity<Moto> crearMoto(@RequestBody Moto moto) {
        Moto nuevaMoto = moto;
        return ResponseEntity.ok(motoService.crearMoto(nuevaMoto));
    }

    @GetMapping("/obtener-moto/{id}")
    public ResponseEntity<Moto> obtenerMotoById(@PathVariable String id) {
        Moto moto = motoService.obtenerMotoById(id);
        return ResponseEntity.ok(moto);
    }

    @DeleteMapping("/eliminar-moto/{id}")
    public ResponseEntity<Void> eliminarMoto(@PathVariable String id) {
        this.motoService.eliminarMoto(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/actualizar-moto/{id}")
    public ResponseEntity<Moto> actualizarMoto(@PathVariable String id, @RequestBody Moto moto) {
        Moto motoActualizada = motoService.actualizarMoto(moto);
        return ResponseEntity.ok(motoActualizada);
    }

    @GetMapping("/listar-motos")
    public ResponseEntity<List<Moto>> listarMotos() {
        return ResponseEntity.ok(motoService.listarMotos());
    }


    @GetMapping("/obtener-moto-by-placa/{placa}")
    public ResponseEntity<Moto> obtenerMotoByPlaca(@PathVariable String placa) {
        Moto moto = motoService.obtenerMotoByPlaca(placa);
        return ResponseEntity.ok(moto);
    }
    
}
