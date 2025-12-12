package com.example.dec._5.bms.bms2025dec.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.dec._5.bms.bms2025dec.model.User;
import com.example.dec._5.bms.bms2025dec.repository.UserRepository;

@Service
public class UserServiceImpl {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;


    public User createUser(String userName, String password) {
        // VALIDATE THE DATA BY FETCHING FROM REPO HERE. 
        String encodedPaString =  passwordEncoder.encode(password);
        User userToBeCreated = new User();
        userToBeCreated.setPwd(encodedPaString);
        userToBeCreated.setUname(userName);
        User createdUser = userRepository.save(userToBeCreated);
        return createdUser;
    }
    
}
