package com.skm.user.userservice.services.impl;


import com.skm.user.userservice.entities.User;
import com.skm.user.userservice.exceptions.ResourceNotFoundException;
import com.skm.user.userservice.repository.UserRepo;
import com.skm.user.userservice.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public User saveUser(User user) {
       String randomUserId =  UUID.randomUUID().toString();
       user.setUserId(randomUserId);
        return userRepo.save(user);
    }

    @Override
    public List<User> getAllUser() {
        return userRepo.findAll();
    }

    @Override
    public User getUser(String userId) {
        return userRepo.findById(userId).orElseThrow(()-> new ResourceNotFoundException("User with Id " +userId+" is not found on server"));
    }
}
