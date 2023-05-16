package com.smartCode.Warehouse.controller;

import com.smartCode.Warehouse.entity.Movimientos;
import com.smartCode.Warehouse.entity.UbicacionesBodegas;
import com.smartCode.Warehouse.repository.UbicacionesBodegasRepository;
import com.smartCode.Warehouse.service.bodegaServiceIMPL.MovimientosServiceIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/warehouse")
public class MovimientosController {

    @Autowired
    private MovimientosServiceIMPL impl;

    @Autowired
    private UbicacionesBodegasRepository repoUbi;


    @GetMapping
    @RequestMapping(value = "ConsultarMovimientos/{id}/shipping", method = RequestMethod.GET)
    public ResponseEntity<?> ConsultarMovimientos(@PathVariable int id){
        UbicacionesBodegas ubicacion = repoUbi.findById(id).orElse(null);
        if (ubicacion == null) {
            return ResponseEntity.notFound().build();
        }
        List<Movimientos> listarMovimientos = this.impl.consultarMovimientos(ubicacion);
        return ResponseEntity.ok(listarMovimientos);
    }

    @PostMapping
    @RequestMapping(value = "CrearMovimientos/shipping", method = RequestMethod.POST)
    public ResponseEntity<?> CrearMovimientos(@RequestBody Movimientos movimientos){
        Movimientos movimientosCreado = this.impl.crearMovimiento(movimientos);
        return ResponseEntity.status(HttpStatus.CREATED).body(movimientosCreado);
    }

    @DeleteMapping
    @RequestMapping(value = "EliminarMovimientos/{id}/shipping", method = RequestMethod.DELETE)
    public ResponseEntity<?> EliminarMovimientos(@PathVariable int id){
        this.impl.eliminarMovimiento(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping
    @RequestMapping(value = "ModificarMovimientos/shipping", method = RequestMethod.PUT)
    public ResponseEntity<?> ModificarMovimientos(@RequestBody Movimientos movimientos){
        Movimientos movimientosModificado = this.impl.modificarMovimiento(movimientos);
        return ResponseEntity.status(HttpStatus.CREATED).body(movimientosModificado);
    }
}
