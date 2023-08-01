package com.skm.hotel.entity;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "hotels")
public class Hotel {

    @Id
    private String id;
    private String name;
    private String location;
    private String about;
}
