package com.skm.user.userservice.repository;

import com.skm.user.userservice.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, String> {

}
