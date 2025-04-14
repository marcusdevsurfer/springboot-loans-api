package com.markdev.springboot_loans_api.service;

import com.markdev.springboot_loans_api.collection.Person;

import java.util.List;

public interface PersonService {
    String save(Person person);

    List<Person> getAll();

    Person getById(String id);

    String deletePerson(String id);
}
