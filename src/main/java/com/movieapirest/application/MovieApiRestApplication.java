/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.movieapirest.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Class what provides exploration of components, automatic configuration
 * properties support.
 * This activate a container of servlets and run our services
 * @author ruben
 */

@SpringBootApplication
public class MovieApiRestApplication {
    
    public static void main(String[] args){
        SpringApplication.run(MovieApiRestApplication.class,args);
    }
}
