package com.example.BackendVolScraper.Controler;
import com.example.BackendVolScraper.Entity.Rating;
import com.example.BackendVolScraper.Service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RatingController {
    @Autowired
    private RatingService ratingService;

    @PostMapping("/api/ratings")
    public void saveRating(@RequestBody Rating rating) {
        ratingService.saveRating(rating);
    }
}
