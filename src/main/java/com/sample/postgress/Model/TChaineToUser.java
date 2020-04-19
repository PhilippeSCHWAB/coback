package com.sample.postgress.Model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.sql.Timestamp;


@Entity
@Table(name = "tuser_tchaine")

public class TChaineToUser {

    @Id
    private int tchaine_id;
    @NotBlank

    private int tuser_id;


    //getter setters


    public int getTchaine_id() {
        return tchaine_id;
    }

    public void setTchaine_id(int tchaine_id) {
        this.tchaine_id = tchaine_id;
    }

    public int getTuser_id() {
        return tuser_id;
    }

    public void setTuser_id(int tuser_id) {
        this.tuser_id = tuser_id;
    }
}
