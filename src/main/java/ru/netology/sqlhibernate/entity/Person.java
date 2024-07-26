package ru.netology.sqlhibernate.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "persons")
@Entity
public class Person {
    @EmbeddedId
    private PersonId person;

    @Column(nullable = false)
    private String phoneNumber;

    @Column(nullable = false)
    private String cityOfLiving;

}
