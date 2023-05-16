package com.smartCode.Warehouse.controller;

import com.smartCode.Warehouse.entity.CargasEnBodegas;
import com.smartCode.Warehouse.entity.ExistenciasEnBodegas;
import com.smartCode.Warehouse.repository.CargasEnBodegasRepository;
import com.smartCode.Warehouse.service.bodegaServiceIMPL.ExistenciasEnBodegasServiceIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/warehouse")
public class ExistenciasEnBodegasController {
    @Autowired
    private ExistenciasEnBodegasServiceIMPL impl;

    @Autowired
    private CargasEnBodegasRepository implCarga;

    @GetMapping
    @RequestMapping(value = "ConsultarExistenciaBod/{id}/location", method = RequestMethod.GET)
    public ResponseEntity<?> ConsultarExistenciaBod(@PathVariable int id){
        CargasEnBodegas ubicacion = implCarga.findById(id).orElse(null);
        if (ubicacion == null) {
            return ResponseEntity.notFound().build();
        }
        ExistenciasEnBodegas mostrarExistenciaEnBodega = this.impl.consultarExisteciasEnBodegas(ubicacion);
        return ResponseEntity.ok(mostrarExistenciaEnBodega);
    }

    @PostMapping
    @RequestMapping(value = "CrearExistenciaEnBodega/location", method = RequestMethod.POST)
    public ResponseEntity<?> CrearExistenciaEnBodega(@RequestBody ExistenciasEnBodegas existenciasEnBodegas){
        ExistenciasEnBodegas existenciasEnBodegasCreado = this.impl.crearExistenciaEnBodega(existenciasEnBodegas);
        return ResponseEntity.status(HttpStatus.CREATED).body(existenciasEnBodegasCreado);
    }
    @PostMapping
    @RequestMapping(value = "EliminarExistenciaEnBodega/{id}/location", method = RequestMethod.DELETE)
    public ResponseEntity<?> EliminarExistenciaEnBodega(@PathVariable int id){
        this.impl.EliminarExistenciaEnBodega(id);
        return ResponseEntity.ok().build();
    }

}
