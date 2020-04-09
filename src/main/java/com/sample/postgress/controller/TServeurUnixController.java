package com.sample.postgress.controller;


import com.sample.postgress.Model.TServeurUnix;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("/api/serveurunix")
@CrossOrigin("http://localhost:4200")
public class TServeurUnixController<tserveurUnixId> {



    @Autowired
    private com.sample.postgress.Repositoy.TServeurUnixRepository TServeurUnixRepository;

    @GetMapping
    public List<TServeurUnix> getServeurUnix(){
        return TServeurUnixRepository.findAll();
    }


    @PostMapping
    public TServeurUnix createServeurUnix(@Valid @RequestBody TServeurUnix tserveurunix) {
        return TServeurUnixRepository.save(tserveurunix);
    }



    @PutMapping("/{tserveurunixId}")
    public TServeurUnix saveServeurUnix(@Valid @RequestBody TServeurUnix tserveurunix){
        return TServeurUnixRepository.save(tserveurunix);
    }


}
