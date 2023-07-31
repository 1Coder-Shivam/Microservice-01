package com.skm.user.service.services;

import com.skm.user.service.entities.User;

import java.util.List;

public interface UserService {

    //create
    User saveUser(User user);

    List<User> getAllUser();

    User getUser(String userId);


}
