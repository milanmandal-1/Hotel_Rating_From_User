package com.emmjay.hotel.HotelService.impl;

import com.emmjay.hotel.HotelService.entities.Hotel;
import com.emmjay.hotel.HotelService.repositories.HotelRepositories;
import com.emmjay.hotel.HotelService.services.HotelServices;

import com.emmjay.hotel.HotelService.exception.ResourceNotFoundExceptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Function;


@Service
public class HotelServicesImpl implements HotelServices {

    @Autowired
    private HotelRepositories hotelRepositories;

    @Override
    public Hotel create(Hotel hotel) {
        String hotelId = UUID.randomUUID().toString();
        hotel.setId(hotelId);
        return hotelRepositories.save(hotel);
    }

    @Override
    public List<Hotel> getAll() {
        return hotelRepositories.findAll();
    }

    @Override
    public Hotel get(String id) {
        return hotelRepositories.findById(id).orElseThrow(() -> new ResourceNotFoundExceptions("Hotel not found with id"));
    }
}