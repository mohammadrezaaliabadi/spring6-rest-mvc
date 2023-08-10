package com.example.spring6restmvc.services;

import com.example.spring6restmvc.model.BeerDTO;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface BeerService {

    List<BeerDTO> listBeers();

    Optional<BeerDTO> getBeerById(UUID id);

    BeerDTO saveNewBeer(BeerDTO beerDto);

    void updateBeerById(UUID beerId, BeerDTO beerDto);

    void deleteById(UUID beerId);

    void patchBeerById(UUID beerId, BeerDTO beerDto);
}

