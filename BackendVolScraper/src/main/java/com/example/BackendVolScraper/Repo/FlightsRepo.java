package com.example.BackendVolScraper.Repo;
import com.example.BackendVolScraper.Entity.Flights;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;
public interface FlightsRepo extends MongoRepository<Flights,String> {


    List<Flights> findByDemande(String demande);
}
