package com.smartCode.Warehouse.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Movimientos")
public class Movimientos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idMovimientos")
    private int idMovimientos;
    @ManyToOne
    @JoinColumn(name = "CargaEnBodegaId")
    private CargasEnBodegas cargasEnBodegas;
    @ManyToOne
    @JoinColumn(name = "UbicacionOrigenBodegaId")
    private UbicacionesBodegas ubicacionesBodegasOrigen;
    @ManyToOne
    @JoinColumn(name = "UbicacionDestinoBodegaId")
    private UbicacionesBodegas ubicacionesBodegasDestinoId;
    @Column(name = "cantidad")
    private int cantidad;
    @ManyToOne
    @JoinColumn(name = "TipoDeMovimientoId")
    private TiposDeMovimientos tiposDeMovimientos;
    @Column(name = "OperariosBodegasId")
    private int operariosBodegasId;

    public int getIdMovimientos() {
        return idMovimientos;
    }

    public void setIdMovimientos(int idMovimientos) {
        this.idMovimientos = idMovimientos;
    }

    public CargasEnBodegas getCargasEnBodegas() {
        return cargasEnBodegas;
    }

    public void setCargasEnBodegas(CargasEnBodegas cargasEnBodegas) {
        this.cargasEnBodegas = cargasEnBodegas;
    }

    public UbicacionesBodegas getUbicacionesBodegasOrigen() {
        return ubicacionesBodegasOrigen;
    }

    public void setUbicacionesBodegasOrigen(UbicacionesBodegas ubicacionesBodegasOrigen) {
        this.ubicacionesBodegasOrigen = ubicacionesBodegasOrigen;
    }

    public UbicacionesBodegas getUbicacionesBodegasDestinoId() {
        return ubicacionesBodegasDestinoId;
    }

    public void setUbicacionesBodegasDestinoId(UbicacionesBodegas ubicacionesBodegasDestinoId) {
        this.ubicacionesBodegasDestinoId = ubicacionesBodegasDestinoId;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public TiposDeMovimientos getTiposDeMovimientos() {
        return tiposDeMovimientos;
    }

    public void setTiposDeMovimientos(TiposDeMovimientos tiposDeMovimientos) {
        this.tiposDeMovimientos = tiposDeMovimientos;
    }

    public int getOperariosBodegasId() {
        return operariosBodegasId;
    }

    public void setOperariosBodegasId(int operariosBodegasId) {
        this.operariosBodegasId = operariosBodegasId;
    }
}
