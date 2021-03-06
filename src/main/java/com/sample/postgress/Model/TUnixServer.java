package com.sample.postgress.Model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;


@Entity
@Table(name = "tunixserver")
public class TUnixServer extends AuditModel {


    @Id
    @GeneratedValue(generator = "tunixserver_generator")
    @SequenceGenerator(
            name = "tunixserver_generator",
            sequenceName = "tunixserver_sequence"//,
       //     initialValue = 1000
    )
    private Long id;
    @NotBlank
    @Size(min = 3, max = 100)

    @Column(columnDefinition = "text")
    private String serveurunix;

    public TUnixServer() {
    }

   public TUnixServer(String serveurunix) {
        this.serveurunix = serveurunix;
    }


    // Getters and Setters (Omitted for brevity)


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getServeurunix() {
        return serveurunix;
    }

    public void setServeurunix(String serveurunix) {
        this.serveurunix = serveurunix;
    }
}
