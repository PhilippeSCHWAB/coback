package com.sample.postgress.Model;



import javax.persistence.*;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tuser")
public class TUser /*extends AuditModel*/ {
    @Id
    @GeneratedValue
    private Integer id;
    private  String iud;
    private String nom;
    private   String prenom;
    private  String email;
    private  String entite;
    private Boolean ismanager;
    private String emailmanager;
    private  Boolean isadmin;
    private  String accesauxchaines;
    private  String serveurunix;
    private String loginunix;
    private Timestamp datedecreation;
    private String auteurcreation;
    private  Timestamp datedemodification;
    private  String auteurdemodification;
    private  Integer refmyaccess;


    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinTable(
            name = "tuser_tchaine",
            joinColumns = @JoinColumn(name = "tuser_id"),
            inverseJoinColumns = @JoinColumn(name = "tchaine_id")
    )

    private Set<TChain> tchaines = new HashSet<>();


    public TUser() {
    }


    public TUser(Integer id, String iud, String nom, String prenom, String email, String entite, Boolean ismanager, String emailmanager,
                 Boolean isadmin, String accesauxchaines, String serveurunix, String loginunix, Timestamp datedecreation,
                 String auteurcreation, Timestamp datedemodification, String auteurdemodification, Integer refmyaccess) {
        this.id = id;
        this.iud = iud;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.entite = entite;
        this.ismanager = ismanager;
        this.emailmanager = emailmanager;
        this.isadmin = isadmin;
        this.accesauxchaines = accesauxchaines;
        this.serveurunix = serveurunix;
        this.loginunix = loginunix;
        this.datedecreation = datedecreation;
        this.auteurcreation = auteurcreation;
        this.datedemodification = datedemodification;
        this.auteurdemodification = auteurdemodification;
        this.refmyaccess = refmyaccess;
         }



// Getters and Setters (Omitted for brevity)


    public TUser( String iud, String nom, String prenom, String email, String entite, Boolean ismanager, String emailmanager,
                 Boolean isadmin, String accesauxchaines, String serveurunix, String loginunix, Timestamp datedecreation,
                 String auteurcreation, Timestamp datedemodification, String auteurdemodification, Integer refmyaccess) {
        this.iud = iud;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.entite = entite;
        this.ismanager = ismanager;
        this.emailmanager = emailmanager;
        this.isadmin = isadmin;
        this.accesauxchaines = accesauxchaines;
        this.serveurunix = serveurunix;
        this.loginunix = loginunix;
        this.datedecreation = datedecreation;
        this.auteurcreation = auteurcreation;
        this.datedemodification = datedemodification;
        this.auteurdemodification = auteurdemodification;
        this.refmyaccess = refmyaccess;
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIud() {
        return iud;
    }

    public void setIud(String iud) {
        this.iud = iud;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEntite() {
        return entite;
    }

    public void setEntite(String entite) {
        this.entite = entite;
    }

    public Boolean getIsmanager() {
        return ismanager;
    }

    public void setIsmanager(Boolean ismanager) {
        this.ismanager = ismanager;
    }

    public String getEmailmanager() {
        return emailmanager;
    }

    public void setEmailmanager(String emailmanager) {
        this.emailmanager = emailmanager;
    }

    public Boolean getIsadmin() {
        return isadmin;
    }

    public void setIsadmin(Boolean isadmin) {
        this.isadmin = isadmin;
    }

    public String getAccesauxchaines() {
        return accesauxchaines;
    }

    public void setAccesauxchaines(String accesauxchaines) {
        this.accesauxchaines = accesauxchaines;
    }

    public String getServeurunix() {
        return serveurunix;
    }

    public void setServeurunix(String serveurunix) {
        this.serveurunix = serveurunix;
    }

    public String getLoginunix() {
        return loginunix;
    }

    public void setLoginunix(String loginunix) {
        this.loginunix = loginunix;
    }

    public Timestamp getDatedecreation() {
        return datedecreation;
    }

    public void setDatedecreation(Timestamp datedecreation) {
        this.datedecreation = datedecreation;
    }

    public String getAuteurcreation() {
        return auteurcreation;
    }

    public void setAuteurcreation(String auteurcreation) {
        this.auteurcreation = auteurcreation;
    }

    public Timestamp getDatedemodification() {
        return datedemodification;
    }

    public void setDatedemodification(Timestamp datedemodification) {
        this.datedemodification = datedemodification;
    }

    public String getAuteurdemodification() {
        return auteurdemodification;
    }

    public void setAuteurdemodification(String auteurdemodification) {
        this.auteurdemodification = auteurdemodification;
    }

    public Integer getRefmyaccess() {
        return refmyaccess;
    }

    public void setTchaines(Set<TChain> tchaines) {
        this.tchaines = tchaines;
    }

    public void setRefmyaccess(Integer refmyaccess) {
        this.refmyaccess = refmyaccess;
    }


    public Set<TChain> getTChaines() {
        return tchaines;
    }



    @Override
    public String toString() {
        return "TUser{" +
                "idaffiché=" + id +
                ", iud='" + iud + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' +
                ", entite='" + entite + '\'' +
                ", ismanager=" + ismanager +
                ", emailmanager='" + emailmanager + '\'' +
                ", isadmin=" + isadmin +
                ", accesauxchaines='" + accesauxchaines + '\'' +
                ", serveurunix='" + serveurunix + '\'' +
                ", loginunix='" + loginunix + '\'' +
                ", datedecreation=" + datedecreation +
                ", auteurcreation='" + auteurcreation + '\'' +
                ", datedemodification=" + datedemodification +
                ", auteurdemodification='" + auteurdemodification + '\'' +
                ", refmyaccess=" + refmyaccess + '\'' +
                 ", tchaines=" + tchaines + '\'' +
           //     ", tchaines='" + tchaines.stream().map(TChaine::getAccesauxchaines).collect(Collectors.toList()) + '\'' +
                '}';
    }




}
