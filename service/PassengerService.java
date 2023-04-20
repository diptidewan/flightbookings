package com.air.flightbookings.service;

import com.air.flightbookings.controller.PassengerController;
import com.air.flightbookings.entity.Passenger;
import com.air.flightbookings.repository.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PassengerService {
    @Autowired
    private PassengerRepository passengerRepository;

    public  Passenger savePassengerDetails(Passenger passenger){
        return passengerRepository.save(passenger);
    }
    public List<Passenger> getPassengerDetails(){
        return passengerRepository.findAll();
    }
}
