package com.proyectoApp.Mirart.model;
import javax.persistence.*;
import javax.persistence.Entity;


@Entity
public class Artista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_artista", nullable = false)
    private Long id_artista;

    @Column(name = "nickname", nullable = false, length = 50)
    private String nickname;

    @Column(name = "email", nullable = false, length = 120)
    private String email;

    @Column(name = "password", nullable = false, length = 100)
    private String password;


    public Artista(Long id_artista, String nickname, String email, String password) {
        this.id_artista = id_artista;
        this.nickname = nickname;
        this.email = email;
        this.password = password;
    }
    public Artista() {
    }


    public Long getId_artista() {
        return id_artista;
    }

    public void setId_artista(Long id_artista) {
        this.id_artista = id_artista;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}


