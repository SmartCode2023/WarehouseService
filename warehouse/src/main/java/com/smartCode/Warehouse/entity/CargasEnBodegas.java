package com.smartCode.Warehouse.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "CargasEnBodegas")
public class CargasEnBodegas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCargasEnBodegas")
    private int idCargasEnBodegas;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "sku")
    private String sku;

    @Column(name = "largo")
    private float largo;

    @Column(name = "ancho")
    private float ancho;

    @Column(name = "alto")
    private float alto;

    @Column(name = "peso")
    private float peso;

    @Column(name = "TipoDeCargaId")
    private int tipoDeCargaId;

    @Column(name = "UnidadesPesosId")
    private int unidadesPesosId;

    @Column(name = "UnidadesDimensionesId")
    private int unidadesDimensionesId;

    public int getIdCargasEnBodegas() {
        return idCargasEnBodegas;
    }

    public void setIdCargasEnBodegas(int idCargasEnBodegas) {
        this.idCargasEnBodegas = idCargasEnBodegas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public float getLargo() {
        return largo;
    }

    public void setLargo(float largo) {
        this.largo = largo;
    }

    public float getAncho() {
        return ancho;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public float getAlto() {
        return alto;
    }

    public void setAlto(float alto) {
        this.alto = alto;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getTipoDeCargaId() {
        return tipoDeCargaId;
    }

    public void setTipoDeCargaId(int tipoDeCargaId) {
        this.tipoDeCargaId = tipoDeCargaId;
    }

    public int getUnidadesPesosId() {
        return unidadesPesosId;
    }

    public void setUnidadesPesosId(int unidadesPesosId) {
        this.unidadesPesosId = unidadesPesosId;
    }

    public int getUnidadesDimensionesId() {
        return unidadesDimensionesId;
    }

    public void setUnidadesDimensionesId(int unidadesDimensionesId) {
        this.unidadesDimensionesId = unidadesDimensionesId;
    }
}
