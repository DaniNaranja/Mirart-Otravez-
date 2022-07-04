package com.proyectoApp.Mirart.model;

import javax.persistence.*;

@Entity
public class Dibujo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_dibujo", nullable = false)
    private Long id;

    @Column(name = "titulo", nullable = false, length=100)
    private String titulo;

    @Column(name = "descripcion", nullable = false, length=100)
    private String descripcion;

    @Column(name = "link", nullable = false, columnDefinition="TEXT")
    private String link;

    @ManyToOne
    @JoinColumn(name= "id")
    private Artista artista;

    /**
     * Constructor vacio a ser utilizado por los controllers
     */
    public Dibujo() {
    }

    /**
     * Constructor de la entidad Dibujp
     * @param id
     * @param titulo
     * @param descripcion
     * @param link
     */

    public Dibujo(Long id, String titulo, String descripcion, String link) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.link = link;
    }

    /**
     * metodo encargado de asignar datos que no son rellenados
     * inmediatamente en el formulario de registro
     *
     */
    @PrePersist
    public void prePersist(){
        artista=null;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
