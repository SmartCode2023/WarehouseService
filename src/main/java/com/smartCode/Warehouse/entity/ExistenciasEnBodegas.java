package com.smartCode.Warehouse.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "ExistenciasEnBodegas")
public class ExistenciasEnBodegas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idExistenciasEnBodegas")
    private int idExistenciasEnBodegas;

    @ManyToOne
    @JoinColumn(name = "BodegasId")
    private Bodega Bodega;
    @Column(name = "cantidadExistente")
    private int cantidadExistente;
    @ManyToOne
    @JoinColumn(name = "CargaEnBodegaId")
    private CargasEnBodegas cargasEnBodegasId;
    @ManyToOne
    @JoinColumn(name = "UbicacionEnBodegaId")
    private UbicacionesBodegas ubicacionesBodegas;

    public int getIdExistenciasEnBodegas() {
        return idExistenciasEnBodegas;
    }

    public void setIdExistenciasEnBodegas(int idExistenciasEnBodegas) {
        this.idExistenciasEnBodegas = idExistenciasEnBodegas;
    }

    public com.smartCode.Warehouse.entity.Bodega getBodega() {
        return Bodega;
    }

    public void setBodega(com.smartCode.Warehouse.entity.Bodega bodega) {
        Bodega = bodega;
    }

    public int getCantidadExistente() {
        return cantidadExistente;
    }

    public void setCantidadExistente(int cantidadExistente) {
        this.cantidadExistente = cantidadExistente;
    }

    public CargasEnBodegas getCargasEnBodegasId() {
        return cargasEnBodegasId;
    }

    public void setCargasEnBodegasId(CargasEnBodegas cargasEnBodegasId) {
        this.cargasEnBodegasId = cargasEnBodegasId;
    }

    public UbicacionesBodegas getUbicacionesBodegas() {
        return ubicacionesBodegas;
    }

    public void setUbicacionesBodegas(UbicacionesBodegas ubicacionesBodegas) {
        this.ubicacionesBodegas = ubicacionesBodegas;
    }
}
