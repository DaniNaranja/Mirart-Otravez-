package com.proyectoApp.Mirart.model;
import javax.persistence.*;
import javax.persistence.Entity;
import java.util.List;
import java.util.Set;


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

    @Column(name="profile_picture", nullable = true, length = 400)
    private String profilePicture;

    @Column(name="banner_picture", columnDefinition="TEXT")
    private String bannerPicture;

    @Column(name = "link_ig", nullable = true, length = 300)
    private String linkIG;

    @Column(name = "link_fb", nullable = true, length = 300)
    private String linkFB;

    @Column(name = "link_tw", nullable = true, length = 300)
    private String linkTW;

    @Column(name = "link_waitlist", nullable = true, length = 400)
    private String linkWaitlist;

    @Column(name = "verif_acc", nullable = true)
    private boolean verifAcc;

    @Column(name = "terms", nullable = true, length = 600)
    private String terms;

    @Column(name = "descripcion", nullable = true, length = 300)
    private String descripcion;

    @OneToMany(mappedBy = "artista")
    private Set<Dibujo> dibujos;

    @OneToMany(mappedBy = "artista")
    private Set<Comision> comisiones;



    public Artista(Long id_artista, String nickname, String email, String password) {
        this.id_artista = id_artista;
        this.nickname = nickname;
        this.email = email;
        this.password = password;
    }
    public Artista() {
    }

    @PrePersist
    public void prePersist(){
        bannerPicture=null;
        linkIG=null;
        linkFB=null;
        linkTW=null;
        verifAcc=true;
        terms=null;
        descripcion=null;
        dibujos= null;
        comisiones= null;

    }


    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Set<Comision> getComisiones() {
        return comisiones;
    }

    public void setComisiones(Set<Comision> comisiones) {
        this.comisiones = comisiones;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }

    public String getBannerPicture() {
        return bannerPicture;
    }

    public void setBannerPicture(String bannerPicture) {
        this.bannerPicture = bannerPicture;
    }

    public String getLinkIG() {
        return linkIG;
    }

    public void setLinkIG(String linkIG) {
        this.linkIG = linkIG;
    }

    public String getLinkFB() {
        return linkFB;
    }

    public void setLinkFB(String linkFB) {
        this.linkFB = linkFB;
    }

    public String getLinkTW() {
        return linkTW;
    }

    public void setLinkTW(String linkTW) {
        this.linkTW = linkTW;
    }

    public String getLinkWaitlist() {
        return linkWaitlist;
    }

    public void setLinkWaitlist(String linkWaitlist) {
        this.linkWaitlist = linkWaitlist;
    }

    public boolean isVerifAcc() {
        return verifAcc;
    }

    public void setVerifAcc(boolean verifAcc) {
        this.verifAcc = verifAcc;
    }

    public String getTerms() {
        return terms;
    }

    public void setTerms(String terms) {
        this.terms = terms;
    }

    public Set<Dibujo> getDibujos() {
        return dibujos;
    }

    public void setDibujos(Set<Dibujo> dibujos) {
        this.dibujos = dibujos;
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


