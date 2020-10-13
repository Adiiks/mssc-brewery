package pl.adiks.msscbrewery.service;

import pl.adiks.msscbrewery.dto.BeerDTO;

import java.util.UUID;

public interface BeerService {

    BeerDTO getBeerById(UUID beerId);

    BeerDTO saveBeer(BeerDTO beerDTO);

    void updateBeer(BeerDTO beerDTO, UUID beerId);

    void deleteById(UUID beerId);
}
