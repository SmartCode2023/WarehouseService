package com.smartCode.Warehouse.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "UbicacionesBodegas")
public class UbicacionesBodegas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idUbicacionesBodegas")
    private int idUbicacionesBodegas;
    @Column(name = "pasillo")
    private int pasillo;
    @Column(name = "estantes")
    private int estantes;
    @ManyToOne
    @JoinColumn(name = "BodegaId")
    private Bodega bodega;

    public int getIdUbicacionesBodegas() {
        return idUbicacionesBodegas;
    }

    public void setIdUbicacionesBodegas(int idUbicacionesBodegas) {
        this.idUbicacionesBodegas = idUbicacionesBodegas;
    }

    public int getPasillo() {
        return pasillo;
    }

    public void setPasillo(int pasillo) {
        this.pasillo = pasillo;
    }

    public int getEstantes() {
        return estantes;
    }

    public void setEstantes(int estantes) {
        this.estantes = estantes;
    }

    public Bodega getBodega() {
        return bodega;
    }

    public void setBodega(Bodega bodega) {
        this.bodega = bodega;
    }
}
