package com.smartCode.Warehouse.controller;

import com.smartCode.Warehouse.entity.Bodega;
import com.smartCode.Warehouse.service.bodegaServiceIMPL.BodegaServiceIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/warehouse")
public class BodegaController {

    @Autowired
    private BodegaServiceIMPL impl;

    @GetMapping
    @RequestMapping(value = "ConsultarBodegas", method = RequestMethod.GET)
    public ResponseEntity<?> ConsultarBodegas(){
        List<Bodega> listarBodega = this.impl.consultarBodega();
        return ResponseEntity.ok(listarBodega);
    }

    @PostMapping
    @RequestMapping(value = "CrearBodegas", method = RequestMethod.POST)
    public ResponseEntity<?> CrearBodegas(@RequestBody Bodega bodega){
        Bodega bodegaCreada = this.impl.crearBodega(bodega);
        return ResponseEntity.status(HttpStatus.CREATED).body(bodegaCreada);
    }

    @DeleteMapping
    @RequestMapping(value = "EliminarBodegas/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> EliminarBodegas(@PathVariable int id){
        this.impl.eliminarBodega(id);
        return ResponseEntity.ok().build();
    }
}
