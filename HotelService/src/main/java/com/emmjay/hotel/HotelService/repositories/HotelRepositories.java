package com.emmjay.hotel.HotelService.repositories;

import com.emmjay.hotel.HotelService.entities.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepositories extends JpaRepository<Hotel, String> {



}
