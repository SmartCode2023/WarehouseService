package com.smartCode.Warehouse.service;

import com.smartCode.Warehouse.entity.TiposDeMovimientos;

import java.util.List;

public interface TipoDeMovimientosService {

    public List<TiposDeMovimientos> consultarTiposDeMovimientos();

    public TiposDeMovimientos crearTipoDeMovimiento(TiposDeMovimientos tiposDeMovimientos);

    public void eliminarTipoDeMovimiento(int id);

    public TiposDeMovimientos modificarTipoDeMovimiento(TiposDeMovimientos tiposDeMovimientos);

}
