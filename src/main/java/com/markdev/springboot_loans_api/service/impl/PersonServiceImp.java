package com.markdev.springboot_loans_api.service.impl;

import com.markdev.springboot_loans_api.collection.Person;
import com.markdev.springboot_loans_api.exceptions.IllegalArgumentException;
import com.markdev.springboot_loans_api.exceptions.ResourceNotFoundException;
import com.markdev.springboot_loans_api.repository.PersonRepository;
import com.markdev.springboot_loans_api.service.PersonService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImp implements PersonService {
    private final PersonRepository personRepository;

    public PersonServiceImp(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public String save(Person person) {
        if (person.getName() == null || person.getName().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        Person personSaved = personRepository.save(person);
        return "Person saved successfully with ID: " + personSaved.getId();
    }

    @Override
    public List<Person> getAll() {
        return personRepository.findAll();
    }

    @Override
    public String deletePerson(String id) {
        if (id == null || id.isEmpty()) {
            throw new IllegalArgumentException("ID cannot be null or empty");
        }
        Person person = personRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Person not found"));
        personRepository.delete(person);
        return "Person deleted successfully with ID: " + person.getId();
    }
}
