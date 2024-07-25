package ru.netology.sqlhibernate.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.sqlhibernate.entity.Person;
import ru.netology.sqlhibernate.repository.Repository;

import java.util.List;

@RestController
@AllArgsConstructor
public class Controller {
    private final Repository repository;

    @GetMapping("/persons/by-city")
    @ResponseBody
    public List<Person> getPersonsByCity(@RequestParam("city") String city) {
        List<Person> result = Repository.getPersonsByCity(city);
        System.out.println(result);
        return result;
    }

}
