package com.example.BackendVolScraper.Service;
import com.example.BackendVolScraper.Entity.Rating;
import com.example.BackendVolScraper.Repo.RatingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RatingService {
    @Autowired
    private RatingRepo ratingRepo;

    public void saveRating(Rating rating) {
        ratingRepo.save(rating);
    }
    public void saveRating(Rating rating) {
        ratingRepo.save(rating);
        updateAverageRating();
    }
}