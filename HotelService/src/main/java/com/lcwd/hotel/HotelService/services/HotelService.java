package com.lcwd.hotel.HotelService.services;

import java.util.List;

import com.lcwd.hotel.HotelService.entites.Hotel;

public interface HotelService {

	
	//create
	Hotel create(Hotel hotel);
	
	//get all
	List<Hotel> getAllHotels();
	
	//get single
	Hotel getHotelById(String id);
}
