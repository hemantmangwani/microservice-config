package com.lcwd.hotel.HotelService.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lcwd.hotel.HotelService.entites.Hotel;

public interface HotelRepository extends JpaRepository<Hotel , String>
{

}
