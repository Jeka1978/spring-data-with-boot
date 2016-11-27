package com.ebay;

import com.ebay.profiles.example.Person;
import com.ebay.profiles.example.PersonService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Evegeny on 27/11/2016.
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = ConfigForTest.class)
public class PersonServiceTest {
    @Autowired
    private PersonService personService;

    @Test
    public void test1() throws Exception {
        String reccomendation = personService.getReccomendation(Person.builder().name("jeka").build());
        System.out.println("reccomendation = " + reccomendation);

    }
}
