package com.skm.hotel.sercvices.impl;

import com.skm.hotel.entity.Hotel;
import com.skm.hotel.repository.Hotelrepo;
import com.skm.hotel.sercvices.HotelService;
import com.skm.hotel.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    private Hotelrepo hotelrepo;
    @Override
    public Hotel create(Hotel hotel) {
        String hotelId = UUID.randomUUID().toString();
        hotel.setId(hotelId);
        return hotelrepo.save(hotel);
    }

    @Override
    public List<Hotel> getAll() {
        return hotelrepo.findAll();
    }

    @Override
    public Hotel getById(String id) {
        return  hotelrepo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Hotel with id "+id+" is not found"));
    }
}
