package com.skm.user.service.services;

import java.util.List;
import com.skm.user.service.entities.User;

public interface UserService {

    //create
    User saveUser(User user);

    List<User> getAllUser();

    User getUser(String userId);


}
