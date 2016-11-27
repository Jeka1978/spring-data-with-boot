package com.ebay.profiles.example;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.Singular;

import java.util.List;
import java.util.Map;

/**
 * Created by Evegeny on 27/11/2016.
 */
@Builder
@Getter
@Setter
public class Person {
    private String name;
    @Singular
    private Map<String, Integer> priorities;
}

