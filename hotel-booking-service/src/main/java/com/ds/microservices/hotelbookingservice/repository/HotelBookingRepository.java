package com.ds.microservices.hotelbookingservice.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ds.microservices.hotelbookingservice.model.Hotel_Booking;

public interface HotelBookingRepository extends JpaRepository <Hotel_Booking, Long>{

	//Optional<List<Hotel_Booking>> findByLocation(String hotel_location);

}
