package com.smartCode.Warehouse.service.bodegaServiceIMPL;

import com.smartCode.Warehouse.entity.TiposDeMovimientos;
import com.smartCode.Warehouse.repository.TiposDeMovimientosRepository;
import com.smartCode.Warehouse.service.TipoDeMovimientosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoDeMovimientoServiceIMPL implements TipoDeMovimientosService {

    @Autowired
    TiposDeMovimientosRepository repo;

    @Override
    public List<TiposDeMovimientos> consultarTiposDeMovimientos() {
        return (List<TiposDeMovimientos>) this.repo.findAll();
    }

    @Override
    public TiposDeMovimientos crearTipoDeMovimiento(TiposDeMovimientos tiposDeMovimientos) {
        return this.repo.save(tiposDeMovimientos);
    }

    @Override
    public void eliminarTipoDeMovimiento(int id) {
        this.repo.deleteById(id);
    }

    @Override
    public TiposDeMovimientos modificarTipoDeMovimiento(TiposDeMovimientos tiposDeMovimientos) {
        return this.repo.save(tiposDeMovimientos);
    }
}
