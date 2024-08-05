package ru.netology.sqlhibernate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.netology.sqlhibernate.repository.PersonRepository;

@SpringBootApplication
public class SqlHibernateApplication {

    public static void main(String[] args) {
        SpringApplication.run(SqlHibernateApplication.class, args);
    }

}
