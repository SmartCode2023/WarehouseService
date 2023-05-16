package com.smartCode.Warehouse.service;

import com.smartCode.Warehouse.entity.CargasEnBodegas;
import com.smartCode.Warehouse.entity.ExistenciasEnBodegas;

import java.util.List;

public interface ExistenciasEnBodegasService {

    public ExistenciasEnBodegas consultarExisteciasEnBodegas(CargasEnBodegas cargasEnBodegas);
    public ExistenciasEnBodegas crearExistenciaEnBodega(ExistenciasEnBodegas existenciasEnBodegas);
    public void EliminarExistenciaEnBodega(int id);
}
