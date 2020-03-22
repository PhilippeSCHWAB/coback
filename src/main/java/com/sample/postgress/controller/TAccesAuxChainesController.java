package com.sample.postgress.controller;


import com.sample.postgress.Model.TAccesAuxChaines;
import com.sample.postgress.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;


import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("/api/bdd")
@CrossOrigin("http://localhost:4200")
public class TAccesAuxChainesController<accesauxchainesId> {


    @Autowired
    private com.sample.postgress.Repositoy.TAccesAuxChainesRepository AccesAuxChainesRepository;

    @GetMapping
    public List<TAccesAuxChaines> getAccesauxchaines(){
        return AccesAuxChainesRepository.findAll();
    }


    @PostMapping
    public TAccesAuxChaines createAccesauxchaines(@Valid @RequestBody TAccesAuxChaines accesauxchaines) {
        return AccesAuxChainesRepository.save(accesauxchaines);
    }



    @PutMapping("/{accesauxchainesId}")
    public TAccesAuxChaines saveAccesauxchaines(@Valid @RequestBody TAccesAuxChaines accesauxchaines){
        return AccesAuxChainesRepository.save(accesauxchaines);
    }

    /*
    @PutMapping(value = "/{accesauxchainesId}")

    public TAccesAuxChaines updateAccesAuxChaines(@PathVariable Long accesauxchainesId,
                                                  @Valid @RequestBody TAccesAuxChaines accesauxchainesRequest) {
        return AccesAuxChainesRepository.findById(accesauxchainesId)
                .map(accesauxchaines -> {
                    accesauxchaines.setAccesauxchaines(accesauxchainesRequest.getAccesauxchaines());
                    return AccesAuxChainesRepository.save(accesauxchaines);
                }).orElseThrow(() -> new ResourceNotFoundException("Question not found with id " + accesauxchainesId));
    }
*/
/*save

    @PutMapping
    public TAccesAuxChaines updateAccesAuxChaines(@PathVariable Long accesauxchainesId,
                                                  @Valid @RequestBody TAccesAuxChaines accesauxchainesRequest) {
        return AccesAuxChainesRepository.findById(accesauxchainesId)
                .map(accesauxchaines -> {
                    accesauxchaines.setAccesauxchaines(accesauxchainesRequest.getAccesauxchaines());
                    return AccesAuxChainesRepository.save(accesauxchaines);
                }).orElseThrow(() -> new ResourceNotFoundException("Question not found with id " + accesauxchainesId));
    }

    */

}
