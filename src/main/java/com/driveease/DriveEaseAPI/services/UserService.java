package com.driveease.DriveEaseAPI.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.driveease.DriveEaseAPI.dto.UserDTO;
import com.driveease.DriveEaseAPI.dto.UserDTO.UserDTOBuilder;
import com.driveease.DriveEaseAPI.entity.User;
import com.driveease.DriveEaseAPI.repository.UserRepository;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private UserRepository userRepository;
    
    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserDTO getUserById(Integer userId){
        User userEntity = userRepository.findUserById(userId);
        return UserDTO.builder()
        .name(userEntity.getName())
        .email(userEntity.getEmail())
        .build();
                
    }
}
