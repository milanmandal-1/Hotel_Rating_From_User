package com.emmjay.user.service.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Hotel {

//    @Id
    private String id;
    private String name;
    private String location;
    private String about;

}