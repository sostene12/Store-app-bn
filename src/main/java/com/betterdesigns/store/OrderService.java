package com.betterdesigns.store;

import com.betterdesigns.store.payment.PaymentService;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

//@Service
public class OrderService {
    private PaymentService paymentService;
    public OrderService(){}

//    @Autowired
    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
        System.out.println("Order service created");
    }

    @PostConstruct
    public void init(){
        System.out.println("Order service Post construct");
    }

    @PreDestroy
    public void cleanUp(){
        System.out.println("Order service Pre destroy");
    }

    public void placeOrder(){
        paymentService.processPayment(10);
    }

}
