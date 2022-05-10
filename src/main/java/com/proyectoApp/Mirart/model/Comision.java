package com.proyectoApp.Mirart.model;

import javax.persistence.*;

@Entity
public class Comision {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_comision", nullable = false)
    private Long idComision;

    @ManyToOne
    @JoinColumn(name = "id_tipo_comision")
    private TipoComision tipoComision;

    @Column(name = "descripcion", nullable = false)
    private String descripcion;

    @Column(name = "precio", nullable = false)
    private int precio;



    public Comision() {
    }

    public Comision(Long idComision, TipoComision tipoComision, String descripcion, int precio) {
        this.idComision = idComision;
        this.tipoComision = tipoComision;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public Long getIdComision() {
        return idComision;
    }

    public void setIdComision(Long idComision) {
        this.idComision = idComision;
    }

    public TipoComision getTipoComision() {
        return tipoComision;
    }

    public void setTipoComision(TipoComision tipoComision) {
        this.tipoComision = tipoComision;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
