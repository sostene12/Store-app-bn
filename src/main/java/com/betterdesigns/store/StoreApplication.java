package com.betterdesigns.store;
import com.betterdesigns.store.entities.Address;
import com.betterdesigns.store.entities.Profile;
import com.betterdesigns.store.entities.Tag;
import com.betterdesigns.store.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
//        ConfigurableApplicationContext context = SpringApplication.run(StoreApplication.class, args);
        var user = User.builder().name("john").email("john@gmail.com").password("password").build();

       var profile = Profile.builder().bio("bio").build();
       user.setProfile(profile);
       profile.setUser(user);
        System.out.println(user);

    }
}

//START FROM spring fundamentals section 4 : 7.6
