package com.air.flightbookings.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long paymentId;
    private String creditCardNo;
    private String cardExpireDate;
    private String cvvNo;
    private String address;
    private String phone;


}
