package com.example.dec._5.bms.bms2025dec.config;

import java.util.concurrent.locks.ReentrantLock;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ReentrantLockBean {
    
    @Bean
    public ReentrantLock createLock(){
        return new ReentrantLock();
    }



    // Anything on top of a class, that starts with @ : is called a Bean in SB
    // Any bean in SpringBoot is a Singleton class.
    // Any bean -- The instance creation is handled by SB.
    /**
     * 
     * @RestController
     * @Service
     * @Repository
     * @Controller
     * @Configuration
     * @Bean
     * 
     * 
     * All of these above are same things internally.
     * @entity
     * 
     */

}
