package com.sample.postgress.Model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;


@Entity
@Table(name = "toutildetest")
public class TTestTool extends AuditModel {
    @Id
    @GeneratedValue(generator = "outildetest_generator")
    @SequenceGenerator(
            name = "outildetest_generator",
            sequenceName = "outildetest_sequence",
            initialValue = 1000
    )
    private Long id;

    @NotBlank
    @Size(min = 3, max = 100)


    @Column(columnDefinition = "text")
    private String outildetest;


    // Getters and Setters (Omitted for brevity)


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOutildetest() {
        return outildetest;
    }

    public void setOutildetest(String outildetest) {
        this.outildetest = outildetest;
    }
}
