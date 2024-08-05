package ru.netology.sqlhibernate.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "persons")
@Entity
@IdClass(PersonId.class)
public class Person implements Serializable {
    @Id
    @Column(nullable = false)
    private String name;
    @Id
    @Column(nullable = false)
    private String surname;
    @Id
    @Column(nullable = false)
    private int age;
    @Column(nullable = false)
    private String phone_number;
    @Column(nullable = false)
    private String city_of_living;
}