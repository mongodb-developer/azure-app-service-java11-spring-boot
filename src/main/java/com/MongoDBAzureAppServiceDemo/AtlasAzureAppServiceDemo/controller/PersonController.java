package com.MongoDBAzureAppServiceDemo.AtlasAzureAppServiceDemo.controller;

import com.MongoDBAzureAppServiceDemo.AtlasAzureAppServiceDemo.model.Person;
import com.MongoDBAzureAppServiceDemo.AtlasAzureAppServiceDemo.repository.PersonRepository;
import com.MongoDBAzureAppServiceDemo.AtlasAzureAppServiceDemo.resource.PersonRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {

    private final PersonRepository personRepository;

    public PersonController(PersonRepository personRepository){
        this.personRepository = personRepository;
    }

    @GetMapping("/person")
    public ResponseEntity<List<Person>> getAllPersons(){
        return ResponseEntity.ok(this.personRepository.findAll());
    }

    @PostMapping("/person")
    public ResponseEntity<Person> createPerson(@RequestBody PersonRequest personRequest) {

        Person person = new Person();
        person.setName(personRequest.getName());
        person.setLocation(personRequest.getLocation());
        person.setGovtId(personRequest.getGovtId());

        return ResponseEntity.status(201).body(this.personRepository.save(person));
    }
}
