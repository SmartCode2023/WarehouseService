package com.smartCode.Warehouse.service;

import com.smartCode.Warehouse.entity.CargasEnBodegas;

import java.util.List;

public interface CargasEnBodegasService {
    public List<CargasEnBodegas> consultarCargasEnBodegas();

    public CargasEnBodegas crearCargaEnBodega(CargasEnBodegas cargasEnBodegas);

    public void eliminarCargasEnBodegas(int id);

    public CargasEnBodegas modificarCargaEnBodega(CargasEnBodegas cargasEnBodegas);
}
