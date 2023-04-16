package com.smartCode.Warehouse.repository;

import com.smartCode.Warehouse.entity.Movimientos;
import com.smartCode.Warehouse.entity.UbicacionesBodegas;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MovimientosRepository extends CrudRepository<Movimientos, Integer> {
    List<Movimientos> findByUbicacionesBodegasDestinoId(UbicacionesBodegas ubicacionesBodegas);
}
