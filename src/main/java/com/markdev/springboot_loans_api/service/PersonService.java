package com.markdev.springboot_loans_api.service;

import com.markdev.springboot_loans_api.collection.Person;
import com.markdev.springboot_loans_api.repository.PersonRepository;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public String save(Person person) {
        return personRepository.save(person).getId();
    }


}
