package com.markdev.springboot_loans_api.controller;

import com.markdev.springboot_loans_api.collection.Person;
import com.markdev.springboot_loans_api.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/persons")
public class PersonController {
    @Autowired
    private PersonService personService;

    @GetMapping
    public List<Person> getAllPersons() {
        return personService.getAll();
    }

    @PostMapping("/create")
    public String savePerson(@RequestBody Person person) {
        return personService.save(person);
    }
}
