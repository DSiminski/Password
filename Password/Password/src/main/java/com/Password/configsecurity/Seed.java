package com.Password.configsecurity;

import com.criptoPassword.entities.User;
import com.criptoPassword.respository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class Seed implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    protected UserRepository userRepository;

    public void createDefaultUser(){

        if(this.userRepository.count() <= 0){

            BCryptPasswordEncoder senha = new BCryptPasswordEncoder();

            User user = new User();
            user.setId(UUID.randomUUID());
            user.setName("DefaultUser");
            user.setEmail("default@gmail.com");
            user.setPassword(senha.encode("123"));

            this.userRepository.save(user);
        }
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        createDefaultUser();
    }
}


