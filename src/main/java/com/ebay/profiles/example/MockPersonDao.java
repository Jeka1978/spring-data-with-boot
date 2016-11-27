package com.ebay.profiles.example;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

/**
 * Created by Evegeny on 27/11/2016.
 */
@Repository
@Profile("dev")
@Primary
public class MockPersonDao implements PersonDao {
    @Override
    public void savePerson(Person person) {
        System.out.println("Saving...");
    }

    @Override
    public Person findPerson(Person person) {
        return Person.builder().name("jeka").priority("cruel", 99).priority("action",20).build();
    }
}
