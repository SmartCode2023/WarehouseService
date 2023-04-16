package com.smartCode.Warehouse.controller;

import com.smartCode.Warehouse.entity.TiposDeMovimientos;
import com.smartCode.Warehouse.service.bodegaServiceIMPL.TipoDeMovimientoServiceIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/warehouse")
public class TipoDeMovimientosController {

    @Autowired
    private TipoDeMovimientoServiceIMPL impl;

    @GetMapping
    @RequestMapping(value = "ConsultarTipoMovimiento", method = RequestMethod.GET)
    public ResponseEntity<?> ConsultarTipoMovimiento(){
        List<TiposDeMovimientos> listarTipoMovimientos = this.impl.consultarTiposDeMovimientos();
        return ResponseEntity.ok(listarTipoMovimientos);
    }

    @PostMapping
    @RequestMapping(value = "CrearTipoMovimiento", method = RequestMethod.POST)
    public ResponseEntity<?> CrearTipoMovimiento(@RequestBody TiposDeMovimientos tiposDeMovimientos){
        TiposDeMovimientos tipoMovimientosCreado = this.impl.crearTipoDeMovimiento(tiposDeMovimientos);
        return ResponseEntity.status(HttpStatus.CREATED).body(tipoMovimientosCreado);
    }
    @DeleteMapping
    @RequestMapping(value = "EliminarTipoMovimiento/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> EliminarTipoMovimiento(@PathVariable int id){
        this.impl.eliminarTipoDeMovimiento(id);
        return ResponseEntity.ok().build();
    }
    @PutMapping
    @RequestMapping(value = "ModificarTipoMovimiento", method = RequestMethod.PUT)
    public ResponseEntity<?> ModificarTipoMovimiento(@RequestBody TiposDeMovimientos tiposDeMovimientos){
        TiposDeMovimientos tipoMovimientosModificado = this.impl.modificarTipoDeMovimiento(tiposDeMovimientos);
        return ResponseEntity.status(HttpStatus.CREATED).body(tipoMovimientosModificado);
    }


}
