package com.smartCode.Warehouse.service.bodegaServiceIMPL;

import com.smartCode.Warehouse.entity.CargasEnBodegas;
import com.smartCode.Warehouse.repository.CargasEnBodegasRepository;
import com.smartCode.Warehouse.service.CargasEnBodegasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CargasEnBodegasServiceIMPL implements CargasEnBodegasService {

    @Autowired
    private CargasEnBodegasRepository repo;


    @Override
    public List<CargasEnBodegas> consultarCargasEnBodegas() {
        return (List<CargasEnBodegas>) this.repo.findAll();
    }

    @Override
    public CargasEnBodegas crearCargaEnBodega(CargasEnBodegas cargasEnBodegas) {
        return this.repo.save(cargasEnBodegas);
    }

    @Override
    public void eliminarCargasEnBodegas(int id) {
        this.repo.deleteById(id);
    }

    @Override
    public CargasEnBodegas modificarCargaEnBodega(CargasEnBodegas cargasEnBodegas) {
        return this.repo.save(cargasEnBodegas);
    }
}
