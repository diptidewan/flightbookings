package com.air.flightbookings.controller;

import com.air.flightbookings.entity.Passenger;
import com.air.flightbookings.service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/passenger")
public class PassengerController {
    @Autowired
    private PassengerService passengerService;
    @PostMapping("/save")
    public Passenger savePassengerDetails(@RequestBody Passenger passenger){
        return passengerService.savePassengerDetails(passenger);
    }
    @GetMapping("/get")
    public List<Passenger> getPassengerDetails(){
        return passengerService.getPassengerDetails();
    }
}
