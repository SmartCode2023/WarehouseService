package com.smartCode.Warehouse.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "TiposDeMovimientos")
public class TiposDeMovimientos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idTiposDeMovimientos")
    private int idTiposDeMovimientos;
    @Column(name = "nombre")
    private String nombre;

    public int getIdTiposDeMovimientos() {
        return idTiposDeMovimientos;
    }

    public void setIdTiposDeMovimientos(int idTiposDeMovimientos) {
        this.idTiposDeMovimientos = idTiposDeMovimientos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
