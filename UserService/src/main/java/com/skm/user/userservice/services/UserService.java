package com.skm.user.userservice.services;


import com.skm.user.userservice.entities.User;

import java.util.List;

public interface UserService {

    //create
    User saveUser(User user);

    List<User> getAllUser();

    User getUser(String userId);


}
