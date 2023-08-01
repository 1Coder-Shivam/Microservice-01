package com.skm.rating.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;




@Document
public class Rating {

    @Id
    private String ratingId;
    private String feedback;
    private String userId;
    private String hotelId;
    private int rating;

    public Rating() {
    }

    public Rating(String ratingId, String feedback, String userId, String hotelId, int rating) {
        this.ratingId = ratingId;
        this.feedback = feedback;
        this.userId = userId;
        this.hotelId = hotelId;
        this.rating = rating;
    }

    public String getRatingId() {
        return ratingId;
    }

    public void setRatingId(String ratingId) {
        this.ratingId = ratingId;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getHotelId() {
        return hotelId;
    }

    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
