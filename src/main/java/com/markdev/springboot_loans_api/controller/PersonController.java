package com.markdev.springboot_loans_api.controller;

import com.markdev.springboot_loans_api.collection.Person;
import com.markdev.springboot_loans_api.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/persons")
public class PersonController {
    @Autowired
    private PersonService personService;
    @PostMapping("/save")
    public String savePerson(@RequestBody Person person) {
        return personService.save(person);
    }

}
