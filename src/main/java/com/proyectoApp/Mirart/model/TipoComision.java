package com.proyectoApp.Mirart.model;

import javax.persistence.*;

@Entity
public class TipoComision {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipo_comision", nullable = false)
    private Long idTipoComision;

    @Column(name = "nombre", nullable = false, length=200)
    private String nombre;
}
