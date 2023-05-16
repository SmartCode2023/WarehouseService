package com.smartCode.Warehouse.controller;

import com.smartCode.Warehouse.entity.UbicacionesBodegas;
import com.smartCode.Warehouse.service.bodegaServiceIMPL.UbicacionesBodegasServiseIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/warehouse")
public class UbicacionesBodegasController {

    @Autowired
    private UbicacionesBodegasServiseIMPL impl;

    @GetMapping
    @RequestMapping(value = "ConsultarUbiBodegas", method = RequestMethod.GET)
    public ResponseEntity<?> ConsultarUbiBodegas(){
        List<UbicacionesBodegas> listarUbiBodega = this.impl.consultarUbicacionesBodegas();
        return ResponseEntity.ok(listarUbiBodega);
    }

    @PostMapping
    @RequestMapping(value = "CrearUbiBodegas", method = RequestMethod.POST)
    public ResponseEntity<?> CrearUbiBodegas(@RequestBody UbicacionesBodegas ubicacionesBodegas){
        UbicacionesBodegas ubiBodegaCreada = this.impl.crearUbicacionBodega(ubicacionesBodegas);
        return ResponseEntity.status(HttpStatus.CREATED).body(ubiBodegaCreada);
    }

    @DeleteMapping
    @RequestMapping(value = "EliminarUbiBodegas/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> EliminarUbiBodegas(@PathVariable int id){
        this.impl.eliminarUbicacionBodega(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping
    @RequestMapping(value = "ModificarUbiBodegas", method = RequestMethod.PUT)
    public ResponseEntity<?> ModificarUbiBodegas(@RequestBody UbicacionesBodegas ubicacionesBodegas){
        UbicacionesBodegas ubiBodegaModificada = this.impl.modificarUbicacionBodega(ubicacionesBodegas);
        return ResponseEntity.status(HttpStatus.CREATED).body(ubiBodegaModificada);
    }

    @GetMapping
    @RequestMapping(value = "BuscarUbiBodega/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> BuscarUbiBodega(@PathVariable int id){
        UbicacionesBodegas ubiBodegas = this.impl.consultarUbicacionBodega(id);
        return ResponseEntity.ok(ubiBodegas);
    }

}
