package com.driveease.DriveEaseAPI.api.controller;

import com.driveease.DriveEaseAPI.api.model.User;
import com.driveease.DriveEaseAPI.services.UserService;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user")
    public User getUser(@RequestParam String email){
        Optional user = userService.getUser(email);
        if(user.isPresent()){
            return (User) user.get();
        }
        return null;
        
    }

}
