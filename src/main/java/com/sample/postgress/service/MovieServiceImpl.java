package com.sample.postgress.service;

import com.sample.postgress.Model.Movie;
import com.sample.postgress.Repositoy.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class MovieServiceImpl implements MovieService {

    private MovieRepository movieRepository;



    //constructor
    public MovieServiceImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }


    @Override
    public List<Movie> findAll() {
        return movieRepository.findAll();
    }



    @Override
    public Movie createMovie(Movie movie) {
        return movieRepository.save(movie);
    }

}
