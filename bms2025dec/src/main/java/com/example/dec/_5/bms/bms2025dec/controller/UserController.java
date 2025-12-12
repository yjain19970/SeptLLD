package com.example.dec._5.bms.bms2025dec.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.dec._5.bms.bms2025dec.dto.UserRequestDTO;
import com.example.dec._5.bms.bms2025dec.dto.UserResponseDTO;
import com.example.dec._5.bms.bms2025dec.model.User;
import com.example.dec._5.bms.bms2025dec.service.UserServiceImpl;
import com.example.dec._5.bms.bms2025dec.translator.UserTranslator;

@RestController
public class UserController {

    @Autowired
    private UserServiceImpl userServiceImpl;


    @PostMapping("/user")
    public UserResponseDTO createUser(@RequestBody UserRequestDTO dto){
        // Validate the details here.
        User createdUser =  userServiceImpl.createUser(dto.getUserName(), dto.getPassword());
        return UserTranslator.toUserResponseDTO(createdUser);
    }
    
}
