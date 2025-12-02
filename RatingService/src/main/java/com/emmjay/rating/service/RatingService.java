package com.emmjay.rating.service;

import com.emmjay.rating.entities.Rating;
import java.util.List;

public interface RatingService {

    // create rating
    Rating create(Rating rating);

    // get all ratings
    List<Rating> getRatings();

    // get all by userId
    List<Rating> getRatingsByUserId(String userId);

    // get all by hotelId
    List<Rating> getRatingsByHotelId(String hotelId);
}
