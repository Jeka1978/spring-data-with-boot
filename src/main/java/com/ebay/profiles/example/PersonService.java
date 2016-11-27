package com.ebay.profiles.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Evegeny on 27/11/2016.
 */
@Service
public class PersonService {
    @Autowired
    private PersonDao personDao;
    public String getReccomendation(Person person) {
        Person personFromDb = personDao.findPerson(person);
        if (person.getPriorities().get("cruel") > 80) {
            return "Game of Thrones";
        }else{
            return "pretty woman";
        }
    }
}
