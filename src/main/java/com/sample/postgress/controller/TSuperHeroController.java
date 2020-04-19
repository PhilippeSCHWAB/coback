package com.sample.postgress.controller;

import com.sample.postgress.Model.SuperHero;
import com.sample.postgress.Model.TUser;
import com.sample.postgress.Repositoy.SuperHeroRepository;
import com.sample.postgress.service.SuperHeroService;
import com.sample.postgress.service.TUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/sh")
@CrossOrigin("http://localhost:4200")
public class TSuperHeroController {


    @Autowired
    private SuperHeroRepository SuperHeroRepository;


    @Resource
 /*   TUserService tuserService;*/
    SuperHeroService superheroservice;


   @GetMapping
    public List<SuperHero> getSuperHeroList(){
       return superheroservice.findAll();
    }


    @PostMapping
    public ResponseEntity<SuperHero> createSuperHero(@RequestBody SuperHero superhero) {
        SuperHero savedSuperHero = superheroservice.createSuperHero(superhero);
        return ResponseEntity.ok(savedSuperHero);
    }


}
