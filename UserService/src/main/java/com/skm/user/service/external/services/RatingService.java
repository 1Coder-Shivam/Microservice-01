package com.skm.user.service.external.services;

import com.skm.user.service.entities.Rating;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

@Service
@FeignClient(name = "RATINGSERVICE")
public interface RatingService {
    //get

    //post
    @PostMapping("/ratings")
    Rating createRating(Rating rating);

    //put
//    Rating updateRating(Rating rating);
}
