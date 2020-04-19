package com.sample.postgress.Repositoy;

import com.sample.postgress.Model.Movie;

import com.sample.postgress.Model.SuperHero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

    @Repository
    public interface SuperHeroRepository extends JpaRepository<SuperHero, Long> {

    }
