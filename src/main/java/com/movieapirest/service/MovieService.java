/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.movieapirest.service;

import com.movieapirest.domain.Movie;
import java.util.List;

/**
 *
 * @author ruben
 */
public interface MovieService {
        
    /**
     * 
     * @return all movies in service
     */
    List<Movie> getAllMovies();

    /**
     * 
     * @param title to identify one movie
     * @return one movie that match the title
     */
    Movie getMovie(String title);
    
    /**
     * 
     * @param movie movie that is added to service
     */
    void addMovie (Movie movie);
    
    /**
     * 
     * @param movie 
     */
    void updateMovie (Movie movie);
    
    /**
     *
     * @param title to identify to movie that will be removed
     * @throws Exception when movie not exist
     */
    void deleteMovie (String title) throws Exception;

    public int getQuantiyMovies();

}

