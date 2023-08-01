package com.skm.rating.repository;

import com.skm.rating.entities.Rating;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface RatingRepo extends MongoRepository<Rating,String> {

    //custom finder Methods
    List<Rating> findByUserId(String userId);
    List<Rating> findByHotelId(String hotelId);
}
