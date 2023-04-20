package com.air.flightbookings.service;

import com.air.flightbookings.entity.Payment;
import com.air.flightbookings.repository.PassengerRepository;
import com.air.flightbookings.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class PaymentService {
    @Autowired
    private PaymentRepository paymentRepository;
    public Payment savePaymentDetails(Payment payment){
        return paymentRepository.save(payment);

    }
}
