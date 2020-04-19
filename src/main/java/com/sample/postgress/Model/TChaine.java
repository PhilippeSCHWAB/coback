package com.sample.postgress.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "tchaine")
public class TChaine {

    @Id
    @GeneratedValue
    private Integer id;
    private String nomdelachaine;
    private String shortname;
    private String accesauxchaines;
    private String codeenvironnement;
    private String ibmexportpath;
    private String buildpath;
    private String rpmpath;
    private String langage;
    private String outildetest;
    private String version;
    private String sed;
    private Boolean optiondecimal;
    private Boolean optionpmml;
    private String callsed;
    private String applicationappelante;
    private String business;
    private Boolean prod;
    private String groupe;
    private Timestamp datedecreation;
    private String auteurcreation;
    private Timestamp datedemodification;
    private String auteurdemodification;

    @JsonIgnore
    @ManyToMany(mappedBy = "tchaines", cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    private Set<TUser> tusers = new HashSet<>();


 /*   @JoinTable(
            name = "tuser_group",
            joinColumns = @JoinColumn(name = "tuser_id")
            //inverseJoinColumns = @JoinColumn(name = "groupm_id")
    )
*/


    public TChaine() {
    }

    public TChaine(Integer id, String nomdelachaine, String shortname, String accesauxchaines, String codeenvironnement, String ibmexportpath,
                   String buildpath, String rpmpath, String langage, String outildetest, String version, String sed, Boolean optiondecimal,
                   Boolean optionpmml, String callsed, String applicationappelante, String business, Boolean prod, String groupe,
                   Timestamp datedecreation, String auteurcreation, Timestamp datedemodification, String auteurdemodification) {
        this.id = id;
        this.nomdelachaine = nomdelachaine;
        this.shortname = shortname;
        this.accesauxchaines = accesauxchaines;
        this.codeenvironnement = codeenvironnement;
        this.ibmexportpath = ibmexportpath;
        this.buildpath = buildpath;
        this.rpmpath = rpmpath;
        this.langage = langage;
        this.outildetest = outildetest;
        this.version = version;
        this.sed = sed;
        this.optiondecimal = optiondecimal;
        this.optionpmml = optionpmml;
        this.callsed = callsed;
        this.applicationappelante = applicationappelante;
        this.business = business;
        this.prod = prod;
        this.groupe = groupe;
        this.datedecreation = datedecreation;
        this.auteurcreation = auteurcreation;
        this.datedemodification = datedemodification;
        this.auteurdemodification = auteurdemodification;
    }
//getters and setters

    public TChaine(String nomdelachaine, String shortname, String accesauxchaines, String codeenvironnement, String ibmexportpath,
                   String buildpath, String rpmpath, String langage, String outildetest, String version, String sed, Boolean optiondecimal,
                   Boolean optionpmml, String callsed, String applicationappelante, String business, Boolean prod, String groupe,
                   Timestamp datedecreation, String auteurcreation, Timestamp datedemodification, String auteurdemodification) {
        this.nomdelachaine = nomdelachaine;
        this.shortname = shortname;
        this.accesauxchaines = accesauxchaines;
        this.codeenvironnement = codeenvironnement;
        this.ibmexportpath = ibmexportpath;
        this.buildpath = buildpath;
        this.rpmpath = rpmpath;
        this.langage = langage;
        this.outildetest = outildetest;
        this.version = version;
        this.sed = sed;
        this.optiondecimal = optiondecimal;
        this.optionpmml = optionpmml;
        this.callsed = callsed;
        this.applicationappelante = applicationappelante;
        this.business = business;
        this.prod = prod;
        this.groupe = groupe;
        this.datedecreation = datedecreation;
        this.auteurcreation = auteurcreation;
        this.datedemodification = datedemodification;
        this.auteurdemodification = auteurdemodification;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomdelachaine() {
        return nomdelachaine;
    }

    public void setNomdelachaine(String nomdelachaine) {
        this.nomdelachaine = nomdelachaine;
    }

    public String getShortname() {
        return shortname;
    }

    public void setShortname(String shortname) {
        this.shortname = shortname;
    }

    public String getAccesauxchaines() {
        return accesauxchaines;
    }

    public void setAccesauxchaines(String accesauxchaines) {
        this.accesauxchaines = accesauxchaines;
    }

    public String getCodeenvironnement() {
        return codeenvironnement;
    }

    public void setCodeenvironnement(String codeenvironnement) {
        this.codeenvironnement = codeenvironnement;
    }

    public String getIbmexportpath() {
        return ibmexportpath;
    }

    public void setIbmexportpath(String ibmexportpath) {
        this.ibmexportpath = ibmexportpath;
    }

    public String getBuildpath() {
        return buildpath;
    }

    public void setBuildpath(String buildpath) {
        this.buildpath = buildpath;
    }

    public String getRpmpath() {
        return rpmpath;
    }

    public void setRpmpath(String rpmpath) {
        this.rpmpath = rpmpath;
    }

    public String getLangage() {
        return langage;
    }

    public void setLangage(String langage) {
        this.langage = langage;
    }

    public String getOutildetest() {
        return outildetest;
    }

    public void setOutildetest(String outildetest) {
        this.outildetest = outildetest;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getSed() {
        return sed;
    }

    public void setSed(String sed) {
        this.sed = sed;
    }

    public Boolean getOptiondecimal() {
        return optiondecimal;
    }

    public void setOptiondecimal(Boolean optiondecimal) {
        this.optiondecimal = optiondecimal;
    }

    public Boolean getOptionpmml() {
        return optionpmml;
    }

    public void setOptionpmml(Boolean optionpmml) {
        this.optionpmml = optionpmml;
    }

    public String getCallsed() {
        return callsed;
    }

    public void setCallsed(String callsed) {
        this.callsed = callsed;
    }

    public String getApplicationappelante() {
        return applicationappelante;
    }

    public void setApplicationappelante(String applicationappelante) {
        this.applicationappelante = applicationappelante;
    }

    public String getBusiness() {
        return business;
    }

    public void setBusiness(String business) {
        this.business = business;
    }

    public Boolean getProd() {
        return prod;
    }

    public void setProd(Boolean prod) {
        this.prod = prod;
    }

    public String getGroupe() {
        return groupe;
    }

    public void setGroupe(String groupe) {
        this.groupe = groupe;
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



    public Set<TUser> getTUsers() {
        return tusers;
    }


    public void addTUser(TUser tuser) {
        tusers.add(tuser);
        tuser.getTChaines().add(this);
    }

    @Override
    public String toString() {
        return "TChaine{" +
                "id=" + id +
                ", nomdelachaine='" + nomdelachaine + '\'' +
                ", shortname='" + shortname + '\'' +
                ", accesauxchaines='" + accesauxchaines + '\'' +
                ", codeenvironnement='" + codeenvironnement + '\'' +
                ", ibmexportpath='" + ibmexportpath + '\'' +
                ", buildpath='" + buildpath + '\'' +
                ", rpmpath='" + rpmpath + '\'' +
                ", langage='" + langage + '\'' +
                ", outildetest='" + outildetest + '\'' +
                ", version='" + version + '\'' +
                ", sed='" + sed + '\'' +
                ", optiondecimal=" + optiondecimal +
                ", optionpmml=" + optionpmml +
                ", callsed='" + callsed + '\'' +
                ", applicationappelante='" + applicationappelante + '\'' +
                ", business='" + business + '\'' +
                ", prod=" + prod +
                ", groupe='" + groupe + '\'' +
                ", datedecreation=" + datedecreation +
                ", auteurcreation='" + auteurcreation + '\'' +
                ", datedemodification=" + datedemodification +
                ", auteurdemodification='" + auteurdemodification + '\'' +
                '}';
    }
}
