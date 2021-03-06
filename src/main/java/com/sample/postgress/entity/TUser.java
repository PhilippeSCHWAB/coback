package com.sample.postgress.entity;


import java.sql.Date;
import java.sql.Timestamp;

public class TUser{


    String iud;
    String nom;
    String prenom;
    String email;
    String entite;
    Boolean ismanager;
    String emailmanager;
    Boolean isadmin;
    String accesauxchaines;
    String serveurunix;
    String loginunix;
    Timestamp datedecreation;
    String auteurcreation;
    Timestamp datedemodification;
    String auteurdemodification;
    Integer refmyaccess;


    public  String getIud() {
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

    public Timestamp getDatedecreation()

    {
        //System.out.println(datedecreation);
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

    public void setRefmyaccess(Integer refmyaccess) {
        this.refmyaccess = refmyaccess;
    }
}
