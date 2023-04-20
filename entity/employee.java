package com.air.flightbookings.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;
    private String phone;
    private  String email;

}
