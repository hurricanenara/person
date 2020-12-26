package com.example.person.controller;

import com.example.person.domain.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
    @GetMapping("/api/persons")
    public Person getPersons() {
        Person person1 = new Person("Nara", 29, "Software Engineer");
        return person1;
    }
}
