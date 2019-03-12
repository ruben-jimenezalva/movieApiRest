/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.movieapirest.service;

import com.movieapirest.domain.Movie;
import com.movieapirest.domain.Person;
import com.movieapirest.exception.MovieNotFoundException;
import com.movieapirest.service.impl.MovieServiceImpl;
import java.lang.Exception;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author ruben
 */
public class MovieServiceTest {
    
    @Autowired
    private MovieService movieService;
    
    public MovieServiceTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
         //MovieService instance = new MovieServiceImpl();
        //Person actor1 = new Person("leonardo","DiCaprio");
        //Person actor2 = new Person("Kate", "Winsley");
        //Person director = new Person("James","Cameron");
    }
    
    @After
    public void tearDown() {
    }    
        
    /**
     * Test of addMovie method, of class MovieService.
     * should add one movie sucessfully
     */
    @Test
    public void testAddObjectMovieInServiceMovieImpl() {
        System.out.println("addMovie");
        /*Movie movie = new Movie();
        MovieService instance = new MovieServiceImpl();
        int previusMovieSize = instance.getQuantiyMovies();
        instance.addMovie(movie);
        assertEquals(previusMovieSize+1, instance.getQuantiyMovies());*/
    }
    
    /**
     * Test of addMovie method, of class MovieService.
     * should not add one movie because it is null
     */
    @Test
    public void testAddNullInServiceMovieImpl() {
        System.out.println("addMovie");
        /*MovieService instance = new MovieServiceImpl();
        int previusMovieSize = instance.getQuantiyMovies();
        instance.addMovie(null);
        assertEquals(previusMovieSize, instance.getQuantiyMovies());*/
    }


    /**
     * Test of getMovie method, of class MovieService.
     * this method should found a movie
     */
    @Test
    public void testGetMovieWithTitleExisting() {
        System.out.println("getMovieWithTitleExisting");
        /*String title = "titanic";

        Movie movie = new Movie(title,"01/01/1998","USA");
        MovieService instance = new MovieServiceImpl();
        instance.addMovie(movie);
        
        Movie result = instance.getMovie(title);
        assertNotNull(result);
        assertEquals(movie, result);*/
    }

    /**
     * Test of getMovie method, of class MovieService.
     * this method should not found a movie why it not exist
     */
    @Test
    public void testGetMovieWithTitleNonExistent() {
        System.out.println("getMovieWithTitleNonExistent");
        /*String title = "hobbit";

        Movie movie = new Movie("titanic","01/01/1998","USA");
        MovieService instance = new MovieServiceImpl();
        instance.addMovie(movie);
        
        Movie result = instance.getMovie(title);
        assertNull(result);*/
    }

    
    
    /**
     * Test of getAllMovies method, of class MovieService.
     * should get all movies sucessfully
     */
    @Test
    public void testGetAllMovies() {
        System.out.println("getAllMovies");
        /*Movie movie1 = new Movie("titanic","01/01/1998","USA");
        Movie movie2 = new Movie("Thor","01/03/2008","USA");
        Movie movie3 = new Movie("Coco","01/04/2018","USA");
        
        MovieService instance = new MovieServiceImpl();
        List<Movie> result = instance.getAllMovies();
        instance.addMovie(movie1);
        instance.addMovie(movie2);
        instance.addMovie(movie3);
        
        assertEquals(instance.getQuantiyMovies(), 3);
        assertTrue(result.contains(movie1));
        assertTrue(result.contains(movie2));
        assertTrue(result.contains(movie3));*/        
    }
    
    
    /**
     * Test of updateMovie method, of class MovieService.
     */
    @Test
    public void testUpdateTitleEmptyToMovie() {
        System.out.println("updateMovie");
        /*Movie movie = null;
        MovieService instance = new MovieServiceImpl();
        instance.updateMovie(movie);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");*/
    }
    
    /**
     * Test of updateMovie method, of class MovieService.
     */
    @Test
    public void testUpdateTitleNotEmptyToMovie() {
        System.out.println("updateMovie");
        /*Movie movie = null;
        MovieService instance = new MovieServiceImpl();
        instance.updateMovie(movie);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");*/
    }
    
        /**
     * Test of updateMovie method, of class MovieService.
     */
    @Test
    public void testUpdatePremiereDateEmptyToMovie() {
        System.out.println("updateMovie");
        /*Movie movie = null;
        MovieService instance = new MovieServiceImpl();
        instance.updateMovie(movie);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");*/
    }
    
    /**
     * Test of updateMovie method, of class MovieService.
     */
    @Test
    public void testUpdatePremiereDateNotEmptyToMovie() {
        System.out.println("updateMovie");
        /*Movie movie = null;
        MovieService instance = new MovieServiceImpl();
        instance.updateMovie(movie);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");*/
    }
    
        /**
     * Test of updateMovie method, of class MovieService.
     */
    @Test
    public void testUpdateCountyOriginEmptyToMovie() {
        System.out.println("updateMovie");
        /*Movie movie = null;
        MovieService instance = new MovieServiceImpl();
        instance.updateMovie(movie);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");*/
    }
    
    /**
     * Test of updateMovie method, of class MovieService.
     */
    @Test
    public void testUpdateCountryOriginNotEmptyToMovie() {
        System.out.println("updateMovie");
        /*Movie movie = null;
        MovieService instance = new MovieServiceImpl();
        instance.updateMovie(movie);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");*/
    }
    
    /**
     * Test of updateMovie method, of class MovieService.
     */
    @Test
    public void testUpdateAddingActorNotNullToMovie() {
        System.out.println("updateMovie");
        /*Movie movie = null;
        MovieService instance = new MovieServiceImpl();
        instance.updateMovie(movie);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");*/
    }

     /**
     * Test of updateMovie method, of class MovieService.
     */
    @Test
    public void testUpdateAddingActorNotNullToMovieTitleMovie() {
        System.out.println("updateMovie");
        /*Movie movie = null;
        MovieService instance = new MovieServiceImpl();
        instance.updateMovie(movie);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");*/
    }
    
    @Test
    public void testUpdateAddingDirectorNotNullToMovie() {
        System.out.println("updateMovie");
        /*Movie movie = null;
        MovieService instance = new MovieServiceImpl();
        instance.updateMovie(movie);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");*/
    }

     /**
     * Test of updateMovie method, of class MovieService.
     */
    @Test
    public void testUpdateAddingDirectorNotNullToMovieTitleMovie() {
        System.out.println("updateMovie");
        /*Movie movie = null;
        MovieService instance = new MovieServiceImpl();
        instance.updateMovie(movie);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");*/
    }
    
    /**
     * Test of deleteMovie method, of class MovieService.
     * should delete movie because it exists
     * @throws java.lang.Exception
     */
    @Test
    public void testDeleteMovieMovieExisting() throws Exception {
        System.out.println("deleteMovieExisting");
        /*String title = "Titanic";
        Movie movie = new Movie(title,"01/01/1998","USA");
        MovieService instance = new MovieServiceImpl();
        instance.addMovie(movie);
        instance.deleteMovie(title);
        assertNull(instance.getMovie(title));*/
    }
    
    /**
     * Test of deleteMovie method, of class MovieService.
     * should trow exception because movie to delete not exists
     * @throws java.lang.Exception
     */
    @Test(expected = MovieNotFoundException.class)
    public void testDeleteMovieNotExistent() throws Exception {
        System.out.println("deleteMovieNonExistent");
        /*String title = "Avatar";
        MovieService instance = new MovieServiceImpl();
        instance.deleteMovie(title);*/
    }
}
