package com.emmjay.user.service;

import com.emmjay.user.service.entities.Rating;
import com.emmjay.user.service.external.services.RatingService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserServiceApplicationTests {

	@Test
	void contextLoads() {
	}

//    @Autowired
//    private RatingService ratingService;
//    @Test
//    void createRating(){
//        Rating rating = Rating.builder().rating(10).userId("").hotelId("").feedback("This is create using feign client").build();
//        Rating saveRating = ratingService.createRating(rating);
//        System.out.println("New Rating created");
//
//    }
}
