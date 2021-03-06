package com.proyectoApp.Mirart.model;
import javax.persistence.*;
import javax.persistence.Entity;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Entity
public class Artista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

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


    @Column(name = "terms", nullable = true, length = 600)
    private String terms;

    @Column(name = "descripcion", nullable = true, length = 300)
    private String descripcion;

    @OneToMany(mappedBy = "artista")
    private Set<Dibujo> dibujos;

    @ManyToMany
    @JoinTable(name = "artista_role", joinColumns = @JoinColumn(name = "id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles;




    /**
     * Constructor de la entidad artista
     *
     * @param id id auto incrementable que tambien es PK
     * @param nickname
     * @param email
     * @param password
     */

    public Artista(Long id, String nickname, String email, String password) {
        this.id = id;
        this.nickname = nickname;
        this.email = email;
        this.password = password;
    }

    public Artista(String nickname, String password) {
        this.nickname = nickname;
        this.password = password;
    }

    /**
     * Constructor vacio a ser utilizado por los controllers
     */
    public Artista() {
    }

    /**
     * metodo encargado de asignar datos que no son rellenados
     * inmediatamente en el formulario de registro
     *
     */
    @PrePersist
    public void prePersist(){
        bannerPicture=null;
        linkIG=null;
        linkFB=null;
        linkTW=null;
        terms=null;
        descripcion=null;
        dibujos= new HashSet<Dibujo>();


    }

    public Artista(String nickname, String email, String password, Set<Role> roles) {
        this.nickname = nickname;
        this.email = email;
        this.password = password;
        this.roles = roles;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

   public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}


