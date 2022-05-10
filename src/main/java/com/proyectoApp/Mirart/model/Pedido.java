package com.proyectoApp.Mirart.model;

import javax.persistence.*;

@Entity
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pedido", nullable = false)
    private Long idPedido;

    @Column(name = "estado", nullable = false, length = 30)
    private String estado;

    @ManyToOne
    @JoinColumn(name= "id_comision")
    private Comision comision;

    @OneToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    @OneToOne
    @JoinColumn(name = "id_artista")
    private Artista artista;

    public Pedido(Long idPedido, String estado, Comision comision, Usuario usuario, Artista artista) {
        this.idPedido = idPedido;
        this.estado = estado;
        this.comision = comision;
        this.usuario = usuario;
        this.artista = artista;
    }

    public Pedido(Long idPedido, Comision comision, Comision tipoComision, String estado) {
        this.idPedido = idPedido;
        this.estado = estado;
    }

    public Pedido() {

    }

    public Long getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Long idPedido) {
        this.idPedido = idPedido;
    }


    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
