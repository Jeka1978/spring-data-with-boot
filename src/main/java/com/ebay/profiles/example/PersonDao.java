package com.ebay.profiles.example;

/**
 * Created by Evegeny on 27/11/2016.
 */
public interface PersonDao {
    void savePerson(Person person);

    Person findPerson(Person person);
}
