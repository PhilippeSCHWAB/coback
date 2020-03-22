package com.sample.postgress.controller;

import com.sample.postgress.Model.TOutilDeTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("/api/outildetest")
@CrossOrigin("http://localhost:4200")
public class TOutilDeTestController<toutilDeTestId> {


    @Autowired
    private com.sample.postgress.Repositoy.TOutilDeTestRepository TOutilDeTestRepository;

    @GetMapping
    public List<TOutilDeTest> getTOutilDeTest(){
        return TOutilDeTestRepository.findAll();
    }


    @PostMapping
    public TOutilDeTest createTOutilDeTest(@Valid @RequestBody TOutilDeTest toutilDeTest) {
        return TOutilDeTestRepository.save(toutilDeTest);
    }



    @PutMapping("/{toutilDeTestId}")
    public TOutilDeTest saveTOutilDeTest(@Valid @RequestBody TOutilDeTest toutilDeTest){
        return TOutilDeTestRepository.save(toutilDeTest);
    }


}
