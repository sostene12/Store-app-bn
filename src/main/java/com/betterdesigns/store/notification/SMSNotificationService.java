package com.betterdesigns.store.notification;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("sms")
@Primary
public class SMSNotificationService implements NotificationService {
    @Override
    public void send(String message,String recipient) {
        System.out.println("SMS Notification");

        System.out.println("Message: " + message);
    }
}
