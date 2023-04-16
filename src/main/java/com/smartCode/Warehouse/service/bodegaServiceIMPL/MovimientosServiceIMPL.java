package com.smartCode.Warehouse.service.bodegaServiceIMPL;

import com.smartCode.Warehouse.entity.Movimientos;
import com.smartCode.Warehouse.entity.UbicacionesBodegas;
import com.smartCode.Warehouse.repository.MovimientosRepository;
import com.smartCode.Warehouse.service.MovimientosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovimientosServiceIMPL implements MovimientosService {

    @Autowired
    private MovimientosRepository repo;


    @Override
    public List<Movimientos> consultarMovimientos(UbicacionesBodegas ubicacionesBodegas) {
        return (List<Movimientos>) this.repo.findByUbicacionesBodegasDestinoId(ubicacionesBodegas);
    }

    @Override
    public Movimientos crearMovimiento( Movimientos movimientos) {
        return this.repo.save(movimientos);
    }

    @Override
    public void eliminarMovimiento(int id) {
        this.repo.deleteById(id);
    }

    @Override
    public Movimientos modificarMovimiento(Movimientos movimientos) {
        return this.repo.save(movimientos);
    }

    @Override
    public Optional<Movimientos> encontrarMovimientoIdBodega(int id) {
        return this.repo.findById(id);
    }
}
