/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.movieapirest.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 *
 * @author ruben
 */

@Entity
public class Movie implements Serializable{
    private @Id @GeneratedValue Long id;
    private String title;
    private String premiereDate;
    private String countryOrigin;
    @ManyToMany
    private final List<Person> actors;
    @ManyToMany
    private final List<Person> directors;

    public Movie(String title, String premiereDate, String countryOrigin){
        this.title = title;
        this.premiereDate = premiereDate;
        this.countryOrigin = countryOrigin;
        this.actors = new ArrayList<>();
        this.directors = new ArrayList<>();
    }

    public Movie() {
        this.actors = new ArrayList<>();
        this.directors = new ArrayList<>();
    }
    
    public void addDirector(Person director){
        this.directors.add(director);
    }
    
    public void addActor(Person actor){
        this.actors.add(actor);
    }
    
    public List<Person> getAllActor(){
        return this.actors;
    }
    
    public List<Person> getAllDirectors(){
        return this.actors;
    }
                
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPremiereDate() {
        return premiereDate;
    }

    public void setPremiereDate(String premiereDate) {
        this.premiereDate = premiereDate;
    }

    public String getCountryOrigin() {
        return countryOrigin;
    }

    public void setCountryOrigin(String countryOrigin) {
        this.countryOrigin = countryOrigin;
    }
   
}
