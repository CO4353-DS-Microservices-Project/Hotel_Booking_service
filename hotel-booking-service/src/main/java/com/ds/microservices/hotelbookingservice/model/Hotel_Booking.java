package com.ds.microservices.hotelbookingservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="hotel")
public class Hotel_Booking {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long hotlId;
	
	@Column(name="hotel_name")
	private String hotelName;
	
	@Column(name="hotel_location")
	private String hotel_location;
	
	@Column(name="rooms")
	private int hotelRooms;

	@Column(name="hotel_price")
	private int hotelPrice;
	
	public Hotel_Booking() {
		super();
	}
	public Hotel_Booking(int hotlId, String hotelName, String hotel_location, int hotelRooms, int hotelPrice) {
		super();
		this.hotlId = hotlId;
		this.hotelName = hotelName;
		this.hotel_location = hotel_location;
		this.hotelRooms = hotelRooms;
		this.hotelPrice = hotelPrice;
	}
	public long getHotlId() {
		return hotlId;
	}
	public void setHotlId(long l) {
		this.hotlId = l;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public String getHotelLocation() {
		return hotel_location;
	}
	public void setHotelLocation(String hotel_location) {
		this.hotel_location = hotel_location;
	}
	public int getHotelRooms() {
		return hotelRooms;
	}

	public void setHotelRooms(int hotelRooms) {
		this.hotelRooms = hotelRooms;
	}
	public int getHotelPrice() {
		return hotelPrice;
	}
	public void setHotelPrice(int hotelPrice) {
		this.hotelPrice = hotelPrice;
	}
		
	
}
