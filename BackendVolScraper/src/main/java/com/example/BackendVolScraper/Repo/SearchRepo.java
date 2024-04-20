package com.example.BackendVolScraper.Repo;

import com.example.BackendVolScraper.Entity.Search;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SearchRepo extends MongoRepository<Search,String> {
    Search findTopByOrderByIdDesc();
}
