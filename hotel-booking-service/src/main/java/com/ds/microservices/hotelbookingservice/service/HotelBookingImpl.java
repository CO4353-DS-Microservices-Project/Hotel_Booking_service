package com.ds.microservices.hotelbookingservice.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ds.microservices.hotelbookingservice.exception.ResourceNotFoundException;
import com.ds.microservices.hotelbookingservice.model.Hotel_Booking;
import com.ds.microservices.hotelbookingservice.repository.HotelBookingRepository;

@Service
@Transactional
public class HotelBookingImpl implements HotelBookingService{
	@Autowired
	private HotelBookingRepository hotelbookingrepository;
	
	@Override
	public Hotel_Booking createHotelBooking(Hotel_Booking hotel) {
		return hotelbookingrepository.save(hotel);
	}

	//@Override
	//public Hotel_Booking updateHotelBooking(Hotel_Booking hotel) {
		//Optional<Hotel_Booking> hotelDB = this.hotelbookingrepository.findById(hotel.getHotlId());
		
		//if(hotelDB.isPresent()) {
			//Hotel_Booking hotelUpdate = hotelDB.get();
			//hotelUpdate.setHotlId(hotel.getHotlId());
			//hotelUpdate.setHotelName(hotel.getHotelName());
			//hotelUpdate.setHotelLocation(hotel.getHotelLocation());
			//hotelUpdate.setHotelRooms(hotel.getHotelRooms());
			//hotelUpdate.setHotelPrice(hotel.getHotelPrice());
			//hotelbookingrepository.save(hotelUpdate);
			//return hotelUpdate;
		//}
		//else {
			//throw new ResourceNotFoundException("Record Not Found with ID : " + hotel.getHotlId());
		//}
	//}

	@Override
	public List<Hotel_Booking> getAllHotels() {
		return this.hotelbookingrepository.findAll();
	}

	//@Override
	//public List<Hotel_Booking> getHotelBookingByLocation(String hotel_location) {
		
		//Optional<List<Hotel_Booking>> hotelDB = this.hotelbookingrepository.findByLocation(hotel_location);
		
		//if(hotelDB.isPresent()) {
			//return hotelDB.get();
		//}
		//else {
			//throw new ResourceNotFoundException("Record Not Found with location : " + hotel_location);
		//}
	//}

}
