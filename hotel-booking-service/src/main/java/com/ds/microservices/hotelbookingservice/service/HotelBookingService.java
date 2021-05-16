package com.ds.microservices.hotelbookingservice.service;

import java.util.List;

import com.ds.microservices.hotelbookingservice.model.Hotel_Booking;

public interface HotelBookingService {
	Hotel_Booking createHotelBooking(Hotel_Booking hotel);
	//Hotel_Booking updateHotelBooking(Hotel_Booking hotel);
	List<Hotel_Booking> getAllHotels();
	//List<Hotel_Booking> getHotelBookingByLocation(String hotel_location);
}
