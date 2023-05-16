package com.smartCode.Warehouse.service.bodegaServiceIMPL;

import com.smartCode.Warehouse.entity.UbicacionesBodegas;
import com.smartCode.Warehouse.repository.UbicacionesBodegasRepository;
import com.smartCode.Warehouse.service.UbicacionesBodegasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UbicacionesBodegasServiseIMPL implements UbicacionesBodegasService {

    @Autowired
    private UbicacionesBodegasRepository repo;


    @Override
    public List<UbicacionesBodegas> consultarUbicacionesBodegas() {
        return (List<UbicacionesBodegas>) this.repo.findAll();
    }

    @Override
    public UbicacionesBodegas crearUbicacionBodega(UbicacionesBodegas ubicacionesBodegas) {
        return this.repo.save(ubicacionesBodegas);
    }

    @Override
    public void eliminarUbicacionBodega(int id) {
        this.repo.deleteById(id);
    }

    @Override
    public UbicacionesBodegas consultarUbicacionBodega(int id) {
        return this.repo.findById(id).get();
    }
    @Override
    public UbicacionesBodegas modificarUbicacionBodega(UbicacionesBodegas ubicacionesBodegas) {
        return this.repo.save(ubicacionesBodegas);
    }
}
