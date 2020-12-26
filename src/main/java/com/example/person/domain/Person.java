package com.example.person.domain;


import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Person extends Timestamped {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String name;

    @Column
    private int age;

    @Column
    private String job;


    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }
}
