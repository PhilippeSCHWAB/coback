package com.sample.postgress.service;


import com.sample.postgress.Model.SuperHero;
import com.sample.postgress.Repositoy.SuperHeroRepository;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class SuperHeroServiceImpl implements SuperHeroService {

    private SuperHeroRepository superheroRepository;



    //constructor
    public SuperHeroServiceImpl(SuperHeroRepository superheroRepository) {
        this.superheroRepository = superheroRepository;
    }


    @Override
    public List<SuperHero> findAll() {
        return superheroRepository.findAll();
    }


    @Override
    public SuperHero createSuperHero(SuperHero superhero) {
        return superheroRepository.save(superhero);
    }


}
