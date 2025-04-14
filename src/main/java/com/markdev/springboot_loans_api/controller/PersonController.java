package com.markdev.springboot_loans_api.controller;

import com.markdev.springboot_loans_api.collection.Person;
import com.markdev.springboot_loans_api.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/persons")
public class PersonController {
    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping
    public List<Person> getAllPersons() {
        return personService.getAll();
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<?> getPersonById(@PathVariable String id) {
        return new ResponseEntity<>(personService.getById(id), HttpStatus.OK);
    }
    @PostMapping("/create")
    public String savePerson(@RequestBody Person person) {
        return personService.save(person);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deletePerson(@PathVariable String id) {
        return new ResponseEntity<>(personService.deletePerson(id), HttpStatus.OK);
    }
}
