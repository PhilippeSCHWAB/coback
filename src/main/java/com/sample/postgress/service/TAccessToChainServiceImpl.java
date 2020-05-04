/**
 * The  class serviceIMPL implement the class service for the CRUD
 */
package com.sample.postgress.service;

import com.sample.postgress.Model.TAccessToChain;
import com.sample.postgress.Repositoy.TAccessToChainRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TAccessToChainServiceImpl implements TAccessToChainService {

    private TAccessToChainRepository taccesauxchainesRepository;


    //constructor
    public TAccessToChainServiceImpl(TAccessToChainRepository taccesauxchainesRepository) {
        this.taccesauxchainesRepository = taccesauxchainesRepository;
    }

    /**
     * List all records
     */
    @Override
    public List<TAccessToChain> findAll() {
        return taccesauxchainesRepository.findAll();
    }

    /**
     * filter on a tid
     */

    @Override
    public Optional<TAccessToChain> FilteredTAccesAuxChaines(Long tid) {
        return taccesauxchainesRepository.findById(tid);
    }


    /**
     * The Get retrieves the list of accesstochain (field only) to form CHAIN
     */
   // @Override
    /*
    public TAccessToChain createtaccesauxchaines(TAccessToChain taccesauxchaines) {
        return taccesauxchainesRepository.save(taccesauxchaines);
    }

*/

    /**
     * update the record
     */
    /*
    @Override
    public ResponseEntity<TAccessToChain> updateTAccesAuxChaines(Long id, TAccessToChain taccesauxchainesToUpdate) {
        return null;
    }
*/

    /**
     * delete the record
     */
    @Override
    public void delete(Long tid) {
        System.out.println("'dfdfdfd'");
        taccesauxchainesRepository.deleteById(tid);
    }


    @Override
    public TAccessToChain save(TAccessToChain taccesauxchaines) {
        return taccesauxchainesRepository.save(taccesauxchaines);
    }
    /**
     * The Get retrieves the list of accesstochain (field only) to form CHAIN
     */
    @Override
    public List<String> getAccesauxchaines() {
        return taccesauxchainesRepository.findAllAccesauxchaines();

    }

}


