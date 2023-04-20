package com.air.flightbookings.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class FlightInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long flightInfoId;
    private String source;
    private String destination;
    private double duration;
    private String routeId;
    @Temporal(TemporalType.DATE)
    private Date flightTime;

}
