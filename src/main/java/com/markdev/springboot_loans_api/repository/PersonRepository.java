package com.markdev.springboot_loans_api.repository;

import com.markdev.springboot_loans_api.collection.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends MongoRepository<Person, String> {
}
