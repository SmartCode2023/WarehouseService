package com.smartCode.Warehouse.service.bodegaServiceIMPL;

import com.smartCode.Warehouse.entity.CargasEnBodegas;
import com.smartCode.Warehouse.entity.ExistenciasEnBodegas;
import com.smartCode.Warehouse.repository.ExistenciasEnBodegasRepository;
import com.smartCode.Warehouse.service.ExistenciasEnBodegasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExistenciasEnBodegasServiceIMPL implements ExistenciasEnBodegasService {

    @Autowired
    private ExistenciasEnBodegasRepository repo;


    @Override
    public ExistenciasEnBodegas consultarExisteciasEnBodegas(CargasEnBodegas cargasEnBodegas) {
        return this.repo.findByCargasEnBodegasId(cargasEnBodegas);
    }

    @Override
    public ExistenciasEnBodegas crearExistenciaEnBodega(ExistenciasEnBodegas existenciasEnBodegas) {
        return this.repo.save(existenciasEnBodegas);
    }

    @Override
    public void EliminarExistenciaEnBodega(int id) {
        this.repo.deleteById(id);
    }
}
