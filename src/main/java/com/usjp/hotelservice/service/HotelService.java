package com.usjp.hotelservice.service;

import com.usjp.hotelservice.model.Hotel;

import java.util.List;

public interface HotelService {
    List<Hotel> getAllHotel();

    Hotel getHotelById(int hotelId);

    List<Hotel> getHotelsByIdList(List<Integer> hotelIdList);
}
