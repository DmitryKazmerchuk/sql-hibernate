package ru.netology.sqlhibernate.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.netology.sqlhibernate.entity.Person;

import java.util.List;

@Repository
public class PersonRepository {
@Autowired
    private EntityManager entityManager;


    public List<Person> getPersonsByCity(String city){
        var query = entityManager.createQuery("select p from Person p where lower(p.cityOfLiving) = lower(:city)", Person.class);
        query.setParameter("city",city);
        return query.getResultList();

    }
}