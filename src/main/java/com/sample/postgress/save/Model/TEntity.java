package com.sample.postgress.Model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;


@Entity
@Table(name = "TEntity")
public class TEntity extends AuditModel {
    @Id
    @GeneratedValue(generator = "entite_generator")
    @SequenceGenerator(
            name = "entite_generator",
            sequenceName = "entite_sequence",
            initialValue = 1000
    )
    private Long id;

    @NotBlank
    @Size(min = 3, max = 100)


    @Column(columnDefinition = "text")
    private String entite;


    // Getters and Setters (Omitted for brevity)


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEntite() {
        return entite;
    }

    public void setEntite(String entite) {
        this.entite = entite;
    }
}
