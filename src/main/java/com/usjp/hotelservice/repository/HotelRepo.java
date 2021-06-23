package com.usjp.hotelservice.repository;

import com.usjp.hotelservice.model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRepo extends JpaRepository<Hotel, Integer> {

}
