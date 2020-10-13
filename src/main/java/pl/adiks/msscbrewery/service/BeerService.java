package pl.adiks.msscbrewery.service;

import pl.adiks.msscbrewery.dto.BeervoDTO;

import java.util.UUID;

public interface BeerService {

    BeervoDTO getBeerById(UUID beerId);

    BeervoDTO saveBeer(BeervoDTO beerDTO);

    void updateBeer(BeervoDTO beerDTO, UUID beerId);
}
