package com.skm.user.service;

import com.skm.user.service.entities.Rating;
import com.skm.user.service.external.services.RatingService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserServiceApplicationTests {

	@Test
	void contextLoads() {
	}

//	@Autowired
//	RatingService ratingService;
//
//	@Test
//	void createRating() {
//		Rating rating = Rating.builder()
//				.feedback("feedback")
//				.hotelId("hotelId")
//				.rating(5)
//				.userId("userId")
//				.build();
//		Rating rating1 = ratingService.createRating(rating);
//		System.out.println("new rating created");
//	}

}
