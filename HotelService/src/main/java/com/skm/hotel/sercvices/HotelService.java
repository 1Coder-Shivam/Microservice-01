package com.skm.hotel.sercvices;

import com.skm.hotel.entity.Hotel;

import java.util.List;

public interface HotelService {

    Hotel create(Hotel hotel);
    List<Hotel> getAll();
    Hotel getById(String id);
}
