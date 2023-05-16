package com.smartCode.Warehouse.repository;

import com.smartCode.Warehouse.entity.CargasEnBodegas;
import com.smartCode.Warehouse.entity.ExistenciasEnBodegas;
import org.springframework.data.repository.CrudRepository;

public interface ExistenciasEnBodegasRepository extends CrudRepository<ExistenciasEnBodegas, Integer> {
    ExistenciasEnBodegas findByCargasEnBodegasId(CargasEnBodegas cargasEnBodegas);
}
