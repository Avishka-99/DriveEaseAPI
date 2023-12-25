package com.driveease.DriveEaseAPI.services;

import com.driveease.DriveEaseAPI.api.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private List<User> userList;

    public UserService() {
        userList = new ArrayList<>();
        User user = new User("avishka@gmail.com","Avishka","Avi");
        User user_2 = new User("capi@gmail.com","Casun","DASF");
        userList.addAll(Arrays.asList(user,user_2));
    }

    public Optional<User> getUser(String email) {
        Optional optional = Optional.empty();
        for (User user:userList){
            if(email.equals(user.getEmail())){
                optional = Optional.of(user);
                return optional;
            }
        }
        return optional;
    }
    //public
}
