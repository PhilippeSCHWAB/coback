package com.sample.postgress.controller;

import com.sample.postgress.Model.TEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("/api/entity")
@CrossOrigin("http://localhost:4200")
public class TEntityController<tentityId> {


    @Autowired
    private com.sample.postgress.Repositoy.TEntityRepository TEntityRepository;

    @GetMapping
    public List<TEntity> getTEntity(){
        return TEntityRepository.findAll();
    }


    @PostMapping
    public TEntity createTEntity(@Valid @RequestBody TEntity tentity) {
        return TEntityRepository.save(tentity);
    }



    @PutMapping("/{tentityId}")
    public TEntity saveTEntity(@Valid @RequestBody TEntity tentity){
        return TEntityRepository.save(tentity);
    }


}
