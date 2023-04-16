package com.smartCode.Warehouse.service;

import com.smartCode.Warehouse.entity.Movimientos;
import com.smartCode.Warehouse.entity.UbicacionesBodegas;

import java.util.List;
import java.util.Optional;

public interface MovimientosService {

    public List<Movimientos> consultarMovimientos(UbicacionesBodegas ubicacionesBodegas);

    public Movimientos crearMovimiento(Movimientos movimientos);

    public void eliminarMovimiento(int id);

    public Movimientos modificarMovimiento(Movimientos movimientos);

    public Optional<Movimientos> encontrarMovimientoIdBodega(int id);
}
