/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.movieapirest.service.impl;

import com.movieapirest.domain.Movie;
import com.movieapirest.exception.MovieNotFoundException;
import com.movieapirest.repository.MovieRepository;
import com.movieapirest.service.MovieService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ruben
 */
public class MovieServiceImpl implements MovieService {
    
    //private List<Movie> movies;
    private final MovieRepository movieRepository;
    
    public MovieServiceImpl(MovieRepository movieRepository){
        //this.movies =  new ArrayList<>();
        this.movieRepository = movieRepository;
    }
    
    @Override
    public List<Movie> getAllMovies() {
        //return this.movies;
        return null;
    }

    @Override
    public Movie getMovie(String title) {
        /*for (Movie movie : this.movies) {
            if (movie.getTitle().equals(title))
                return movie;
        }
        return null;*/
        return null;
    }

    @Override
    public void addMovie(Movie movie) {
        /*if(movie != null)
            this.movies.add(movie);*/
    }

    @Override
    public void updateMovie(Movie movie) {
    }

    @Override
    public void deleteMovie(String title) throws Exception {
        /*Boolean found = false;
        Movie movieToDelete = null;
        for (Movie movie : this.movies) {
            if (movie.getTitle().equals(title)){
                movieToDelete = movie;
                found =  true;
            }
        }
        if(!found)
            throw new MovieNotFoundException("this movie not exists");
        else
            this.movies.remove(movieToDelete);*/
    }

    /**
     *
     * @return
     */
    @Override
    public int getQuantiyMovies(){
        //return this.movies.size();
        return 0;
    }
    
}
