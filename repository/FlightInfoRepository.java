package com.air.flightbookings.repository;

import com.air.flightbookings.entity.FlightInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightInfoRepository extends JpaRepository<FlightInfo, Long> {
}
