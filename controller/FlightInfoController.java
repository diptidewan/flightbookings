package com.air.flightbookings.controller;

import com.air.flightbookings.entity.FlightInfo;
import com.air.flightbookings.entity.Passenger;
import com.air.flightbookings.repository.FlightInfoRepository;
import com.air.flightbookings.service.FlightInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/flightinfo")
public class FlightInfoController {
    @Autowired
    private FlightInfoService flightInfoService;

    @PostMapping("/save")
    public FlightInfo saveFlightInfo(@RequestBody FlightInfo flightInfo){
        return flightInfoService.saveFlightInfo(flightInfo);
    }
    @GetMapping("/get")
    public List<FlightInfo> getFlightInfo(){
        return flightInfoService.getFlightInfo();
    }

}
