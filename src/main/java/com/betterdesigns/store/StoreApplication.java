package com.betterdesigns.store;

import com.betterdesigns.store.notification.NotificationManager;
import com.betterdesigns.store.user.User;
import com.betterdesigns.store.user.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(StoreApplication.class, args);
//        var orderService = context.getBean(OrderService.class);
//        orderService.placeOrder();

        var userService = context.getBean(UserService.class);
        userService.registerUser(new User(1L,"sostene@gmail.com","sostene@2024","Sostene"));
//        userService.registerUser(new User(1L,"sostene@gmail.com","sostene@2024","Sostene"));

//        context.close();

    }


}


//START FROM spring fundamentals section 4 : 1
