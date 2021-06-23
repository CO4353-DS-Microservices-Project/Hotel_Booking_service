package com.usjp.hotelservice.service;

import com.usjp.hotelservice.model.Hotel;
import com.usjp.hotelservice.repository.HotelRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class HotelServiceImpl implements HotelService {
    @Autowired
    HotelRepo hotelRepo;

    @Override
    public List<Hotel> getAllHotel() {
        return hotelRepo.findAll();
    }

    @Override
    public Hotel getHotelById(int hotelId) {
        return hotelRepo.findById(hotelId).orElse(null);
    }

    @Override
    public List<Hotel> getHotelsByIdList(List<Integer> hotelIdList) {
        List<Hotel> finalList = new ArrayList<>();
        for (Integer id : hotelIdList) {
            Optional<Hotel> hotelOptional = hotelRepo.findById(id);
            hotelOptional.ifPresent(finalList::add);
        }
        return finalList;
    }

}
