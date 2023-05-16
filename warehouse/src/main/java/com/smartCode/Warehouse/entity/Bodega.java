package com.smartCode.Warehouse.entity;

import jakarta.persistence.*;

@Entity
@Table (name = "bodega")
public class Bodega {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "BodegaId")
    private int BodegaId;

    @Column(name = "DireccionesId")
    private int direccionesId;

    public int getBodegaId() {
        return BodegaId;
    }

    public void setBodegaId(int bodegaId) {
        BodegaId = bodegaId;
    }

    public int getDireccionesId() {
        return direccionesId;
    }

    public void setDireccionesId(int direccionesId) {
        this.direccionesId = direccionesId;
    }
}
