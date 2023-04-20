package com.air.flightbookings.entity;

import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

import java.util.Date;

public class flightBooking {
    private long flghtBookingId;
    @Temporal(TemporalType.DATE)
    private Date bookDate;

}
