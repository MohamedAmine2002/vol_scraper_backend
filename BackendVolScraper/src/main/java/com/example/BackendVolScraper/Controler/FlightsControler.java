package com.example.BackendVolScraper.Controler;

import java.util.List;
import com.example.BackendVolScraper.Entity.Flights;
import com.example.BackendVolScraper.Service.FlightsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Flight")
public class FlightsControler {

    private final FlightsService flightsService;
    @Autowired
    public FlightsControler(FlightsService flightsService) {

        this.flightsService = flightsService;
    }
    @GetMapping(value= "/GetAll")
    private Iterable<Flights> getFlights() {

        return flightsService.listAll();
    }
    @GetMapping("/latest")
    public List<Flights> getLatestVolScrapes() {
        return flightsService.getLatestVolScrapes();
    }



}
