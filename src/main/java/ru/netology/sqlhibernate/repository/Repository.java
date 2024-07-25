package ru.netology.sqlhibernate.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.AllArgsConstructor;
import ru.netology.sqlhibernate.entity.Person;

import java.util.List;

@org.springframework.stereotype.Repository
@AllArgsConstructor
public class Repository {
    @PersistenceContext
    private static EntityManager entityManager;

    public static List<Person> getPersonsByCity(String city) {
        return entityManager.createQuery("from Person where city = UPPER(:city)", Person.class)
                .setParameter("city", city)
                .getResultList();
    }
}
