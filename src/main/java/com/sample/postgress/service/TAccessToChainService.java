/**
 * The  class service connects the controller and the repository for the CRUD
 */
package com.sample.postgress.service;

import com.sample.postgress.Model.TAccessToChain;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;


public interface TAccessToChainService {
    /**
     * The Get retrieves the list of accesstochain
     */
    List<TAccessToChain> findAll();

    /**
     * Filter record by id
     */
    Optional<TAccessToChain> FilteredTAccesAuxChaines(Long tid);

    /**
     * Delete record by id
     */
      void delete(Long tid);

    /**
     * Save record
     */
    TAccessToChain save(TAccessToChain taccesauxchaines);


    /**
     * The Get retrieves the list of accesstochain (field only) to form CHAIN
     */
    List<String> getAccesauxchaines();

}

    /*
    TAccessToChain createtaccesauxchainesservice(TAccessToChain taccesauxchaines);
    ResponseEntity<TAccessToChain> updateTAccesAuxChaines(Long id, TAccessToChain taccesauxchainesToUpdate);
   */

