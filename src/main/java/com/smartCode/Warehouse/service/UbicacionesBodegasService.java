package com.smartCode.Warehouse.service;

import com.smartCode.Warehouse.entity.UbicacionesBodegas;

import java.util.List;

public interface UbicacionesBodegasService {

    public List<UbicacionesBodegas> consultarUbicacionesBodegas();

    public UbicacionesBodegas crearUbicacionBodega(UbicacionesBodegas ubicacionesBodegas);

    public void eliminarUbicacionBodega(int id);

    public UbicacionesBodegas consultarUbicacionBodega(int id);

    public UbicacionesBodegas modificarUbicacionBodega(UbicacionesBodegas ubicacionesBodegas);
}
