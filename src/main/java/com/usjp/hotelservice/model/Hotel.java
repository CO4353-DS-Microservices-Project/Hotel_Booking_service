package com.usjp.hotelservice.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Hotel {

    @Id
    private int hotelId;

    private String hotelName;

    private int hotelRoomsCount;

    private int hotelRoomPrice;

    private String hotelLocation;

    public Hotel(int hotelId, String hotelName, int hotelRoomsCount, int hotelRoomPrice, String hotelLocation) {
        this.hotelId = hotelId;
        this.hotelName = hotelName;
        this.hotelRoomsCount = hotelRoomsCount;
        this.hotelRoomPrice = hotelRoomPrice;
        this.hotelLocation = hotelLocation;
    }

    public Hotel() {
    }

    public int getHotelId() {
        return hotelId;
    }

    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getHotelRoomsCount() {
        return hotelRoomsCount;
    }

    public void setHotelRoomsCount(int hotelRoomsCount) {
        this.hotelRoomsCount = hotelRoomsCount;
    }

    public int getHotelRoomPrice() {
        return hotelRoomPrice;
    }

    public void setHotelRoomPrice(int hotelRoomPrice) {
        this.hotelRoomPrice = hotelRoomPrice;
    }

    public String getHotelLocation() {
        return hotelLocation;
    }

    public void setHotelLocation(String hotelLocation) {
        this.hotelLocation = hotelLocation;
    }
}
