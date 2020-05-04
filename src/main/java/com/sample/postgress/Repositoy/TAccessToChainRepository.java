/**
 * This class repository dialogue wirth JPA to access at the database for the  class <b>taccesstochain</b>
 */
package com.sample.postgress.Repositoy;


import com.sample.postgress.Model.TAccessToChain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Retrieves the list of accesstochain (field only) to form CHAIN
 */
@Repository
public interface TAccessToChainRepository extends JpaRepository<TAccessToChain, Long> {
    @Query("SELECT taccesauxchaines FROM TAccessToChain taccesauxchaines where taccesauxchaines.accesauxchaines = :accesauxchaines")
    List<TAccessToChain> findAllAccesauxchaines(String accesauxchaines);
    @Query("SELECT distinct taccesauxchaines.accesauxchaines FROM TAccessToChain taccesauxchaines ")
    List<String> findAllAccesauxchaines();


}

