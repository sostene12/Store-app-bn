package com.betterdesigns.store.notification;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("email")
public class EmailNotificationService implements NotificationService{

    @Value("${mail.host}")
    private String host;

    @Value("${mail.port}")
    private String port;

    @Override
    public void send(String message,String recipient) {
        System.out.println("Email Notification");

        System.out.println("Message: " + message);
        System.out.println("Recipient: " + recipient);
        System.out.println("Host: " + host);
        System.out.println("Port: " + port);
    }
}
