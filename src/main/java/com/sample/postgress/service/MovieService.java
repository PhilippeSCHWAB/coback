package com.sample.postgress.service;

import com.sample.postgress.Model.Movie;
import com.sample.postgress.Model.SuperHero;

import java.util.List;

public interface MovieService {

    List<Movie> findAll();


    Movie createMovie(Movie movie);
}
