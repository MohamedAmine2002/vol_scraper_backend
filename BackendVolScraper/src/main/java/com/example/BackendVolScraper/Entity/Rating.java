package com.example.BackendVolScraper.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="rating")
public class Rating {
    @Id
    private String id;
    private int stars;
    private String message;
    private double averageRating;

    public Rating() {
    }

    public Rating(String id, int stars, String message) {
        this.id = id;
        this.stars = stars;
        this.message = message;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

