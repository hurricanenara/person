package com.example.person.service;

import com.example.person.domain.Person;
import com.example.person.domain.PersonRepository;
import com.example.person.domain.PersonRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class PersonService {
    private final PersonRepository personRepository;

    @Transactional
    public Long update(Long id, PersonRequestDto requestDto) {

        Person person1 = personRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("No such id")
        );
        person1.update(requestDto);
        return person1.getId();
    }
}
