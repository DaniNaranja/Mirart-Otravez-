package com.proyectoApp.Mirart.model;
import org.springframework.boot.autoconfigure.security.SecurityProperties;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;


@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id_usuario", nullable=false)
    private Long id_usuario;

    @Column(name="nickname", nullable=false, length=50)
    private String nickname;

    @Column(name="email", nullable=false, length=120)
    private String email;

    @Column(name="password", nullable=false, length=100)
    private String password;

    @Column(name="profile_picture", columnDefinition="TEXT")
    private String profilePicture;

    @Column(name="banner_picture", columnDefinition="TEXT")
    private String bannerPicture;

    @Column(name = "verif_acc", nullable = false)
    private boolean verifAcc;

    @Column(name = "descripcion", nullable = true, length = 300)
    private String descripcion;


    /**
     * Constructor vacio a ser utilizado por los Controllers
     */
    public Usuario() {
    }

    /**
     * Constructor de la entidad usuario
     * @param id_usuario
     * @param nickname
     * @param email
     * @param password
     */

    public Usuario(Long id_usuario, String nickname, String email, String password) {
        this.id_usuario = id_usuario;
        this.nickname = nickname;
        this.email = email;
        this.password = password;

    }


    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getBannerPicture() {
        return bannerPicture;
    }

    public void setBannerPicture(String bannerPicture) {
        this.bannerPicture = bannerPicture;
    }

    public boolean isVerifAcc() {
        return verifAcc;
    }

    public void setVerifAcc(boolean verifAcc) {
        this.verifAcc = verifAcc;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(String profiePicture) {
        this.profilePicture = profilePicture;
    }

    public Long getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Long id_usuario) {
        this.id_usuario = id_usuario;
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


