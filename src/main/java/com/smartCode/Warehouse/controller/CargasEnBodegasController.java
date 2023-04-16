package com.smartCode.Warehouse.controller;

import com.smartCode.Warehouse.entity.CargasEnBodegas;
import com.smartCode.Warehouse.service.bodegaServiceIMPL.CargasEnBodegasServiceIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/warehouse")
public class CargasEnBodegasController {

    @Autowired
    private CargasEnBodegasServiceIMPL impl;

    @GetMapping
    @RequestMapping(value = "ConsultarCargaBod", method = RequestMethod.GET)
    public ResponseEntity<?> ConsultarCargaBod(){
        List<CargasEnBodegas> listarCargasBod = this.impl.consultarCargasEnBodegas();
        return ResponseEntity.ok(listarCargasBod);
    }
    @PostMapping
    @RequestMapping(value = "CrearCargaBod", method = RequestMethod.POST)
    public ResponseEntity<?> CrearCargaBod(@RequestBody CargasEnBodegas cargasEnBodegas){
        CargasEnBodegas cargasBodCreada = this.impl.crearCargaEnBodega(cargasEnBodegas);
        return ResponseEntity.status(HttpStatus.CREATED).body(cargasBodCreada);
    }
    @DeleteMapping
    @RequestMapping(value = "EliminarCargaBod/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> EliminarCargaBod(@PathVariable int id){
        this.impl.eliminarCargasEnBodegas(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping
    @RequestMapping(value = "ModificarCargaBod", method = RequestMethod.PUT)
    public ResponseEntity<?> ModificarCargaBod(@RequestBody CargasEnBodegas cargasEnBodegas){
        CargasEnBodegas cargasBodModificada = this.impl.modificarCargaEnBodega(cargasEnBodegas);
        return ResponseEntity.status(HttpStatus.CREATED).body(cargasBodModificada);
    }


}
