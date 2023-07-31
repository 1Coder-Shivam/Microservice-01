package com.skm.hotel.repository;

import com.skm.hotel.entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Hotelrepo extends JpaRepository<Hotel, String> {
}
