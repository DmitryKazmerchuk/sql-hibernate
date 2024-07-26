package ru.netology.sqlhibernate.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.sqlhibernate.entity.Person;
import ru.netology.sqlhibernate.repository.PersonRepository;

import java.util.List;

@RestController
public class PersonController {
    private final PersonRepository personRepository;

    public PersonController(PersonRepository personsRepository) {
        this.personRepository = personsRepository;
    }

    @GetMapping("/persons/by-city")
    public List<Person> getPersons(@RequestParam String city) {
        return personRepository.getPersonsByCity(city);
    }

}
