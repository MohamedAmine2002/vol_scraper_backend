package com.example.BackendVolScraper.Service;

import com.example.BackendVolScraper.Entity.Flights;
import com.example.BackendVolScraper.Entity.Search;
import com.example.BackendVolScraper.Repo.FlightsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.BackendVolScraper.Repo.SearchRepo;
import java.util.List;


@Service
public class FlightsService {
    @Autowired
    private  FlightsRepo repo;
    @Autowired
    private  SearchRepo repo1 ;
    public FlightsService(FlightsRepo repo) {

        this.repo = repo;
    }


    public Iterable<Flights> listAll() {

        return  this.repo.findAll();
    }

    public List<Flights> getLatestVolScrapes() {
        Search lastDemande = repo1.findTopByOrderByIdDesc();
        if (lastDemande != null) {
            // Récupérer les détails du vol correspondant à cet ID de demande
            return repo.findByDemande(lastDemande.getId());
        }
        return null; // ou une liste vide selon votre logique
    }
}
