package com.skm.user.service.services.impl;


import com.skm.user.service.entities.Hotel;
import com.skm.user.service.entities.Rating;
import com.skm.user.service.entities.User;
import com.skm.user.service.exceptions.ResourceNotFoundException;
import com.skm.user.service.external.services.HotelService;
import com.skm.user.service.repository.UserRepo;
import com.skm.user.service.services.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private HotelService hotelService;

    private final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Override
    public User saveUser(User user) {
        String randomUserId = UUID.randomUUID().toString();
        user.setUserId(randomUserId);
        return userRepo.save(user);
    }

    @Override
    public List<User> getAllUser() {
        return userRepo.findAll();
    }

    @Override
    public User getUser(String userId) {
        User user = userRepo.findById(userId).orElseThrow(() -> new ResourceNotFoundException("User with Id " + userId + " is not found on server"));
        Rating[] ratingOfUser = restTemplate.getForObject("http://RATINGSERVICE/ratings/users/" + userId, Rating[].class);

        logger.info("{} ", ratingOfUser);
        List<Rating> ratings = Arrays.stream(Objects.requireNonNull(ratingOfUser)).toList();

        List<Rating> ratingList = ratings.stream().map(rating -> {
            //api call to get hotel details
//            ResponseEntity<Hotel> forEntity = restTemplate.getForEntity("http://HOTELSERVICE/hotels/" + rating.getHotelId(), Hotel.class);
            Hotel hotel = hotelService.getHotel(rating.getHotelId());
//            logger.info("response status code: {}", forEntity.getStatusCode());
            //set the hotel details to rating
            rating.setHotel(hotel);
            //return rating
            return rating;
        }).collect(Collectors.toList());
        user.setRatings(ratingList);
        return user;
    }
}
