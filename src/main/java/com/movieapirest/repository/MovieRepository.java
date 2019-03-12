/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.movieapirest.repository;

import com.movieapirest.domain.Movie;
//import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author ruben
 */
public interface MovieRepository extends JpaRepository<Movie, Long>{
    /*
    List<Movie> findAllMovies();
    
    Movie findMovie(String title);
    
    void saveMovie(Movie movie);
    
    void updateMovie(Movie movie);
    
    void deleteMovie(Movie movie);
    */
}
