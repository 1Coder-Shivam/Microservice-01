package com.skm.hotel.controller;

import com.skm.hotel.entity.Hotel;
import com.skm.hotel.sercvices.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelController {

    @Autowired
    private HotelService hotelService;

    //create
    @PreAuthorize("hasAuthority('Admin')")
    @PostMapping
    public ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel){
        Hotel createdHotel = hotelService.create(hotel);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdHotel);
    }

    //get all
    @PreAuthorize("hasAuthority('SCOPE_internal') || hasAuthority('Admin')")
    @GetMapping
    public ResponseEntity<List<Hotel>> getAllHotel(){
        List<Hotel> hotels = hotelService.getAll();
        return ResponseEntity.ok(hotels);
    }

    //get by id
    @PreAuthorize("hasAuthority('SCOPE_internal')")
    @GetMapping("/{hotelId}")
    public ResponseEntity<Hotel> getHotelById(@PathVariable String hotelId){
        Hotel hotel = hotelService.getById(hotelId);
        return ResponseEntity.ok(hotel);
    }
}
