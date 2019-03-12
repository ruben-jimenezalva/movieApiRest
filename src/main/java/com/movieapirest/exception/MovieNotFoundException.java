/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.movieapirest.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


/**
 *
 * @author ruben
 */

@ResponseStatus(HttpStatus.NOT_FOUND)
public class MovieNotFoundException extends Exception {
    
    public MovieNotFoundException(String message){
        super(message);
    }
    
}
