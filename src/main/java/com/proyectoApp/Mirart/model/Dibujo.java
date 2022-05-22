package com.proyectoApp.Mirart.model;

import javax.persistence.*;

@Entity
public class Dibujo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_dibujo", nullable = false)
    private Long id_dibujo;

    @Column(name = "titulo", nullable = false, length=100)
    private String titulo;

    @Column(name = "descripcion", nullable = false, length=100)
    private String descripcion;

    @Column(name = "link", nullable = false, columnDefinition="TEXT")
    private String link;

    @ManyToOne
    @JoinColumn(name= "id_artista")
    private Artista artista;


    public Dibujo() {
    }

    public Dibujo(Long id_dibujo, String titulo, String descripcion, String link) {
        this.id_dibujo = id_dibujo;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.link = link;
    }

    @PrePersist
    public void prePersist(){
        artista=null;

    }

    public Long getId_dibujo() {
        return id_dibujo;
    }

    public void setId_dibujo(Long id_dibujo) {
        this.id_dibujo = id_dibujo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }
}
