package com.smartCode.Warehouse.service;

import com.smartCode.Warehouse.entity.Bodega;

import java.util.List;

public interface BodegaService {

    public List<Bodega> consultarBodega();

    public Bodega crearBodega(Bodega bodega);

    public void eliminarBodega(int id);
}
