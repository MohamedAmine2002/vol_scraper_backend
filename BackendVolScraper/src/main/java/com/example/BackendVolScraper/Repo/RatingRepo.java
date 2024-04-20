package com.example.BackendVolScraper.Repo;

import com.example.BackendVolScraper.Entity.Rating;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RatingRepo extends MongoRepository<Rating, String> {

}
