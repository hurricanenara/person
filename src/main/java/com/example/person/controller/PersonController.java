package com.example.person.controller;

import com.example.person.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
    @GetMapping("/persons")
    public Person getPersons() {
        Person person1 = new Person("Nara", 29, "Software Engineer");
        Person person2 = new Person("Stitch", 10, "626");
        Person person3 = new Person("Lilo", 13, "CEO");
        return person1;
    }
}
