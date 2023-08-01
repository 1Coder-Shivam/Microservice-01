package com.skm.rating.services;

import com.skm.rating.entities.Rating;

import java.util.List;

public interface RatingService {
    //create
    Rating createRating(Rating rating);

    //get all Rating
    List<Rating> getAllRating();

    //get Rating by UserId
    List<Rating> getRatingByUserId(String userId);

    //get Rating by HotelId
    List<Rating> getRatingByHotelId(String hotelId);
}
