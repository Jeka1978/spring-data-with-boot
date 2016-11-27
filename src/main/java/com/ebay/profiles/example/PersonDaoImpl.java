package com.ebay.profiles.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Random;

/**
 * Created by Evegeny on 27/11/2016.
 */
@Repository
@Prod
public class PersonDaoImpl implements PersonDao {
    @Autowired
    private PersonRepository personRepository;
    @Override
    public void savePerson(Person person) {
        personRepository.save(person);
    }

    @Override
    public Person findPerson(Person person) {
        Person byName = personRepository.findByName(person.getName());
        if (byName == null) {
            HashMap<String, Integer> map = new HashMap<>();
            Random random = new Random();
            map.put("cruel", 70+random.nextInt(20));
            person.setPriorities(map);
            personRepository.save(person);
            return personRepository.findByName(person.getName());
        }
        return byName;
    }
}





