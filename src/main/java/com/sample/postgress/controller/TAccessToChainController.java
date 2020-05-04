
/**
 * This class CONTROLLER allows the CRUD on the setting table <b>taccestochain</b>
 * its use in the form CHAIN
 */


package com.sample.postgress.controller;

import com.sample.postgress.Model.TAccessToChain;
import com.sample.postgress.service.TAccessToChainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("/api/accesauxchaines")
@CrossOrigin("http://localhost:4200")
public class TAccessToChainController {

    @Autowired
    private com.sample.postgress.Repositoy.TAccessToChainRepository AccesAuxChainesRepository;


    @Resource
    TAccessToChainService taccesauxchainesservice;


    /**
     * The Get retrieves the list of accesstochain
     */
    @GetMapping
    public List<TAccessToChain> getTAccesAuxChaines(){
        System.out.println("get sur accesauxchaines");
        return taccesauxchainesservice.findAll();
    }

    /**
     * The Get retrieves the list of accesstochain (field only) to form CHAIN
     */
    @GetMapping("/accesauxchaines")
    public List<String> getAccesauxchaines() {
        return (this.taccesauxchainesservice.getAccesauxchaines());
    }

    /**
     * The Get create a record
     */
    @PostMapping
    public TAccessToChain createTAccesAuxChaines(@Valid @RequestBody TAccessToChain taccesauxchaines) {
        System.out.println("post sur taccesauxchaines : " + taccesauxchaines);
        return taccesauxchainesservice.save(taccesauxchaines);
    }


    /**
     * The put upgrade a record
     */
    @PutMapping("/{taccesAuxChainesId}")
    public TAccessToChain saveTAccesAuxChaines(@Valid @RequestBody TAccessToChain taccesaauxchaines){
        System.out.println("put sur taccesauxchaines : " + taccesaauxchaines);
        return taccesauxchainesservice.save(taccesaauxchaines);
    }

    /**
     * The delete delete a record
     */
    @DeleteMapping("/{tid}")
    public void delete(@PathVariable Long tid){
        System.out.println("delete sur taccesAuxChainesId : " + tid);
        this.taccesauxchainesservice.delete(tid);
    }
}
