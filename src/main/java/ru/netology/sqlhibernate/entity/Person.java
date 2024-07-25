package ru.netology.sqlhibernate.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "PERSONS")
public class Person {
    @EmbeddedId
    private PersonId personId;

    @Column(name = "phone_number", nullable = false, length = 254)
    private String phoneNumber;

    @Column(name = "city_of_living", nullable = false, length = 254)
    private String city;

    @Override
    public String toString() {
        return "\nPerson {" + personId
                + ", phoneNumber= " + phoneNumber
                + ", city= " + city
                + "}";
    }
}
