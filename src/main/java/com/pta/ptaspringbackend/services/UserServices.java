package com.pta.ptaspringbackend.services;

import com.pta.ptaspringbackend.data.UserRepository;
import com.pta.ptaspringbackend.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class UserServices {

    private final UserRepository userRepository;

    public UserServices(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
}
