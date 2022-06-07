package com.proyectoApp.Mirart.model;

import javax.persistence.*;

@Entity
public class Comision {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_comision", nullable = false)
    private Long idComision;

    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;
    @Column(name = "descripcion", nullable = false)
    private String descripcion;

    @Column(name = "precio", nullable = false)
    private int precio;

    @Column(name="comm_sample", columnDefinition="TEXT", nullable = false)
    private String commSample;

    @ManyToOne
    @JoinColumn(name= "id_artista")
    private Artista artista;


    /**
     * Constructor vacio a ser utilizado por los controllers
     */
    public Comision() {
    }

    /**
     * Constructor de la entidad Comision
     * @param idComision id auto incrementable
     * @param nombre
     * @param descripcion
     * @param precio
     */
    public Comision(Long idComision,String nombre, String descripcion, int precio) {
        this.idComision = idComision;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public Long getIdComision() {
        return idComision;
    }

    public void setIdComision(Long idComision) {
        this.idComision = idComision;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public String getCommSample() {
        return commSample;
    }

    public void setCommSample(String commSample) {
        this.commSample = commSample;
    }
}
