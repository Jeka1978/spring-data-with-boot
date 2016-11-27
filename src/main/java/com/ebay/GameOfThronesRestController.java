package com.ebay;

import com.ebay.profiles.example.Person;
import com.ebay.profiles.example.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Evegeny on 27/11/2016.
 */
@RestController
public class GameOfThronesRestController {
    @Autowired
    private PersonService personService;

    @GetMapping("/ping")
    public String ping() {
        return "ok";
    }



    @GetMapping("/reccomendation/{name}")
    public String reccomend(@PathVariable String name) {
        return personService.getReccomendation(Person.builder().name(name).build());
    }

}
