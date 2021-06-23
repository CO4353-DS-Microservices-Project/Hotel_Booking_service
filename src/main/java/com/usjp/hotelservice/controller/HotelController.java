package com.usjp.hotelservice.controller;

import com.usjp.hotelservice.model.Hotel;
import com.usjp.hotelservice.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class HotelController {

    @Autowired
    HotelService hotelService;

    @GetMapping("/getAllHotel")
    ResponseEntity<List<Hotel>> getAllHotel() {
        return new ResponseEntity<>(hotelService.getAllHotel(), HttpStatus.OK);
    }

    @GetMapping("/getHotelById/{id}")
    Hotel getHotelById(@PathVariable("id") int id) {
        return hotelService.getHotelById(id);
    }

    @PostMapping("/getHotelsByIdList")
    List<Hotel> getHotelsByIdList(
            @RequestBody List<Integer> hotelIdList
    ) {
        return hotelService.getHotelsByIdList(hotelIdList);
    }

}
