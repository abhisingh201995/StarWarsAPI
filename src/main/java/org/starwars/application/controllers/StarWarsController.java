package org.starwars.application.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.starwars.application.pojo.StarWarsInfo;
import org.starwars.application.service.StarWarsService;

@RestController
@RequestMapping("/information")
public class StarWarsController {
    @Autowired
    private StarWarsService starWarsService;
    @GetMapping
    public ResponseEntity<StarWarsInfo>  getInformation() {
        return new ResponseEntity<>( starWarsService.getInformation(), HttpStatus.OK);
    }
}

