package com.sample.postgress.entity;

import java.sql.Timestamp;
import java.util.Objects;

public class TChaine {


    String nomdelachaine;
    String shortname ;
    String  accessauxchaines ;
    String  codeenvironnement ;
    String    ibmexportpath;
    String   buildpath;
    String   rpmpath;
    String   langage ;
    String    outildetest ;
    String     version ;
    String     sed ;
    Boolean  optiondecimal ;
    Boolean   optionpmml ;
    String callsed ;
    String    applicationappelante ;
    String  business ;
    Boolean prod ;
    String   groupe ;
    Timestamp   datedecreation   ;
    String    auteurcreation       ;
    Timestamp    datedemodification   ;
    String   auteurdemodification;

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

    public String getAccessauxchaines() {
        return accessauxchaines;
    }

    public void setAccessauxchaines(String accessauxchaines) {
        this.accessauxchaines = accessauxchaines;
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
}
