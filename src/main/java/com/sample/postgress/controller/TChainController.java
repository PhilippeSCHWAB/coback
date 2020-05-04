
/**
 * This class CONTROLLER allows the CRUD on the main table <b>tchain</b>
 */

package com.sample.postgress.controller;
import java.util.List;
import java.util.Optional;
import javax.annotation.Resource;


import com.sample.postgress.Model.TChain;
import com.sample.postgress.Model.TChainToUser;
import com.sample.postgress.Repositoy.TChainRepository;
import com.sample.postgress.service.TChainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/chaine")
@CrossOrigin("http://localhost:4200")
public class TChainController {


    @Autowired
    private TChainRepository TChainRepository;


    @Resource
    TChainService tchaineService;

    @GetMapping
    public List<TChain> getTChaineList(){
        return tchaineService.findAll();
    }

    @GetMapping("/{tid}")
    public Optional<TChain> FilteredChaine(@PathVariable long tid) {
        System.out.println("tchainecontroler yyyy: " + tid);
       return tchaineService.FilteredChaine(tid);
    }

    @PostMapping
    public ResponseEntity<TChain> createTchaine(@RequestBody TChain tchaine) {
        TChain savedTChain = tchaineService.createTChaine(tchaine);
        return ResponseEntity.ok(savedTChain);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TChain> updateTChaine(@PathVariable Long id, @RequestBody TChain tchaineToUpdate ) {
        ResponseEntity<TChain> tchaineResponse = tchaineService.updateTChaine(id,tchaineToUpdate);
        return tchaineResponse;
    }



    @DeleteMapping("/{tid}")

    public void deleteChaine(@PathVariable Long tid)
    { System.out.println("tchainecontroler : " +tid);
        this.tchaineService.deleteChaine(tid);
    }




    @PostMapping(value = "/createchaintouser")
    public void createTChaineToUser(TChainToUser tchainetouser) {
        System.out.println("TChaineToUser : " +tchainetouser);
        tchaineService.createTChaineToUSer(tchainetouser);    }


/*##############    ok
    @PostMapping
    public TChaine createtchaine(@Valid @RequestBody TChaine tchaine) {
        return TChaineRepository.save(tchaine);
    }
 */


/*
    @GetMapping("/filter/{tuid}")
    public Optional<TChaine> FilteredChaine(@PathVariable long tuid) {
        System.out.println("tchainecontroler : " +tuid);
        this.tchaineService.FilteredChaine(tuid);
        return tchaineService.FilteredChaine(tuid);
    }

*/

/*
    @PostMapping(value = "/createTChaine")
    public void createTChaine(@RequestBody TChaine tchaine) {
        tchaineService.createTChaine(tchaine);    }
*/
/*
    @PostMapping
    public TChaine createTChaine(@Valid @RequestBody TChaine tchaine) {
        return TChaineRepository.save(tchaine);
    }


    @PutMapping(value = "/updateTChaine/{tuid}")
    public void updateTChaine(@RequestBody TChaine tchaine) {
        tchaineService.updateTChaine(tchaine);    }


  @DeleteMapping("/{tuid}")
    public void deleteChaine(@PathVariable String tuid) {
      //  System.out.println("tchainecontroler : " +tuid);
        this.tchaineService.deleteChaine(tuid);
    }

/*


    @GetMapping("/filter")
    public List<TChaine> getFilteredChaineList(@RequestParam String iudSelectedForm) {
        System.out.println("tchainecontroler : " +iudSelectedForm);
        return tchaineService.getFilteredChaineList(iudSelectedForm);
    }
    */
/*
    @PostMapping
    public ResponseEntity<TChaine> createTChaine(/*@Valid @RequestBody*/ /*TChaine tchaineToCreate) {
        TChaine savedTChaine = tchaineService.createTChaine(tchaineToCreate);
        System.out.println("XXXX :" +   savedTChaine.getIud());
        return ResponseEntity.ok(savedTChaine);

    }

    */


    // /postgressTlist/tchaineList"



/*
    @GetMapping("/filter")
    public List<TChaine> getFilteredChaineList(@RequestParam String iudSelectedForm) {
        System.out.println("tchainecontroler : " +iudSelectedForm);
           return tchaineService.getFilteredChaineList(iudSelectedForm);
}
*/

     /*
    @PutMapping(value = "/executeUpdateTChaine")
    public void executeUpdateTChaine(@RequestBody TChaine tchaine) {
        tchaineService.executeUpdateTChaine(tchaine);

    }


    @DeleteMapping(value = "/deleteTChaineById")
    public void deleteTChaine(@RequestBody TChaine tchaine) {
        tchaineService.deleteTChaine(tchaine);
*/
/*
        @DeleteMapping(value = "/deleteTChaineById/{tiud}")
        public void deleteTChaine(@PathVariable String tuid) {
            this.tchaineService.deleteTChaine(tuid);
*/


}
