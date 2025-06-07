package com.betterdesigns.store;

import com.betterdesigns.store.payment.PaymentService;
import com.betterdesigns.store.payment.PaypalPaymentService;
import com.betterdesigns.store.payment.StripePaymentService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Value("${payment.type:stripe}")
    private String paymentType;

    @Bean
    public PaymentService stripe(){
        return new StripePaymentService();
    }
    @Bean
    public PaymentService paypal(){
        return new PaypalPaymentService();
    }

    @Bean
    @Scope("prototype")
    public OrderService orderService(){
        return paymentType.equals("stripe") ?  new OrderService(stripe()) : new OrderService(paypal());
    }
}
