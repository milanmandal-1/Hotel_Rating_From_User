package com.emmjay.user.service.entities;

import lombok.*;

//import static org.junit.jupiter.api.Assertions.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Rating {
    private String ratingId;
    private String userId;
    private String hotelId;
    private int rating;
    private String feedback;

    private Hotel hotel;
}