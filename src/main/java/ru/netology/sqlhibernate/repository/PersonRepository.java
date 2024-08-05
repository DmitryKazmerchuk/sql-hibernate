package ru.netology.sqlhibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.netology.sqlhibernate.entity.Person;
import ru.netology.sqlhibernate.entity.PersonId;

import java.util.List;
import java.util.Optional;

public interface PersonRepository extends JpaRepository<Person, PersonId> {
    @Query("select p from Person as p where lower(p.city_of_living) = lower(:city)")
    List<Person> findByCity(String city);
    @Query("select p from Person as p where lower(p.name) = lower(:name) and lower(p.surname) = lower(:surname)")
    Optional<Person> findByNameAndSurname(String name, String surname);
    @Query("select p from Person as p where p.age < :age order by p.age")
    List<Person> findByAgeLessThan(int age);
}
