package com.emmjay.rating.entities;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.*;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "user_ratings")
public class Rating {
    @Id
    private String id;
    private String userId;
    private String hotelId;
    private int rating;
    private String feedback;
}
