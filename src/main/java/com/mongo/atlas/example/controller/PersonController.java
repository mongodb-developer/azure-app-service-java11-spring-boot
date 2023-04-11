package com.mongo.atlas.example.controller;

import com.mongo.atlas.example.model.Person;
import com.mongo.atlas.example.repository.PersonRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class PersonController {

    private final PersonRepository personRepository;

    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello azure!";
    }

    @GetMapping("/persons")
    public Object getAllPersons() {
        try {
            return this.personRepository.findAll();
        } catch (Exception exception) {
            return exception;
        }
    }

    @PostMapping("/person")
    @ResponseStatus(HttpStatus.CREATED)
    public Person createPerson(@RequestBody Person person) {
        return this.personRepository.save(person);
    }
}
