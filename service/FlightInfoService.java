package com.air.flightbookings.service;

import com.air.flightbookings.entity.FlightInfo;
import com.air.flightbookings.repository.FlightInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightInfoService {
    @Autowired
    private FlightInfoRepository flightInfoRepository;

    public FlightInfo saveFlightInfo(FlightInfo flightInfo) {
        return flightInfoRepository.save(flightInfo);
    }

    public List<FlightInfo> getFlightInfo() {
        return flightInfoRepository.findAll();
    }
}
