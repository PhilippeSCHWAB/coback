
/**
 * This class Model structure the relationship between field of the table et the class  <b>taccesstochain</b>
 */


package com.sample.postgress.Model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

/**
 * Structure
 */
@Entity
@Table(name = "Taccesauxchaines")
public class TAccessToChain extends AuditModel {
    @Id
    @GeneratedValue(generator = "accesauxchaines_generator")
    @SequenceGenerator(
            name = "accesauxchaines_generator",
            sequenceName = "accesauxchaines_sequence",
            initialValue = 1000
    )
    private Long id;

    @NotBlank
    @Size(min = 3, max = 100)


    @Column(columnDefinition = "text")
    private String accesauxchaines;


    /**
     * Getters and Setters
     */

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccesauxchaines() {
        return accesauxchaines;
    }

    public void setAccesauxchaines(String accesauxchaines) {
        this.accesauxchaines = accesauxchaines;
    }

}
