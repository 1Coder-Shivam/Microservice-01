package com.skm.user.service.entities;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Rating {

    private String ratingId;
    private String feedback;
    private String userId;
    private String hotelId;
    private int rating;

    private Hotel hotel;
}
