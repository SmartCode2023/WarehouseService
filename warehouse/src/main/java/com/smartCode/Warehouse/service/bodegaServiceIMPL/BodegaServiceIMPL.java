package com.smartCode.Warehouse.service.bodegaServiceIMPL;

import com.smartCode.Warehouse.entity.Bodega;
import com.smartCode.Warehouse.repository.BodegaRepository;
import com.smartCode.Warehouse.service.BodegaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BodegaServiceIMPL implements BodegaService {
    @Autowired
    private BodegaRepository repo;

    @Override
    public List<Bodega> consultarBodega() {
        return (List<Bodega>) this.repo.findAll();
    }

    @Override
    public Bodega crearBodega(Bodega bodega) {
        bodega.setBodegaId(bodega.getBodegaId());
        bodega.setDireccionesId(bodega.getDireccionesId());
        return this.repo.save(bodega);
    }

    @Override
    public void eliminarBodega(int id) {
        this.repo.deleteById(id);
    }
}
