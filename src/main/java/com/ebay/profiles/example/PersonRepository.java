package com.ebay.profiles.example;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Evegeny on 27/11/2016.
 */
public interface PersonRepository extends MongoRepository<Person,Long> {
    Person findByName(String name);
}
