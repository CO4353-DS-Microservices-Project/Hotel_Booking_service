package com.ds.microservices.hotelbookingservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ds.microservices.hotelbookingservice.model.Hotel_Booking;
import com.ds.microservices.hotelbookingservice.service.HotelBookingService;

@RestController
public class HotelBookingController {
	
	@Autowired
	private HotelBookingService hotelBookingService;
	
	@GetMapping("/hotels")
	public ResponseEntity<List<Hotel_Booking>> getAllHotels(){
		
		return ResponseEntity.ok().body(hotelBookingService.getAllHotels());
	}
	

	//@GetMapping("/hotels/{hotel_location}")
	//public ResponseEntity<List<Hotel_Booking>> getHotelByLocation(@PathVariable String hotel_location){
		
		//return ResponseEntity.ok().body(hotelBookingService.getHotelBookingByLocation(hotel_location));
	//}
	

	@PostMapping("/createhotel")
	public ResponseEntity<Hotel_Booking> createHotels(@RequestBody Hotel_Booking hotel_booking){
		return ResponseEntity.ok().body(this.hotelBookingService.createHotelBooking(hotel_booking));
	}
	
}
