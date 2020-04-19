package com.sample.postgress.service;


import com.sample.postgress.Model.SuperHero;

import java.util.List;

public interface SuperHeroService {

    List<SuperHero> findAll();

    SuperHero createSuperHero(SuperHero superhero);


}
