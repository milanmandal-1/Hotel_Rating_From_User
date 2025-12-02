package com.emmjay.hotel.HotelService.services;

import com.emmjay.hotel.HotelService.entities.Hotel;

import java.util.List;

public interface HotelServices {

    //create
    Hotel create(Hotel hotel);

    //getall
    List<Hotel> getAll();


    //get single
    Hotel get(String id);
}
