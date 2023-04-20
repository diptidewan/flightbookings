package com.air.flightbookings.controller;

import com.air.flightbookings.entity.Payment;
import com.air.flightbookings.repository.PaymentRepository;
import com.air.flightbookings.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/payment")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;
    @PostMapping("/save")
    public Payment savePaymentDetails(@RequestBody Payment payment){
        return paymentService.savePaymentDetails(payment);
    }
}
