package com.driveease.DriveEaseAPI.api.controller;

import com.driveease.DriveEaseAPI.dto.UserDTO;
import com.driveease.DriveEaseAPI.entity.User;
import com.driveease.DriveEaseAPI.services.UserService;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "{id}",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserDTO> getUserById(@PathVariable Integer id ){
        UserDTO userdto = userService.getUserById(id);
        System.out.println(userdto);
        return ResponseEntity.ok(userdto);
    }

}
