package com.air.flightbookings.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Passenger {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long passengerId;
    private String firstName;
    private String lastName;
    private String email;
    private String dateOfBirth;
    private String phoneNo;

}
