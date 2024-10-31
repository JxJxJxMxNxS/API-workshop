package com.encora.workshop.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

public interface GreetingsApi {
    @GetMapping("/hello")
    ResponseEntity<String> helloWorld();
}