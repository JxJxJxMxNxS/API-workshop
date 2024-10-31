package com.encora.workshop.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController()
public class GreetingsApiController implements GreetingsApi {
    public ResponseEntity<String> helloWorld() {
        return new ResponseEntity<>("Hello", HttpStatus.OK);
    }
}