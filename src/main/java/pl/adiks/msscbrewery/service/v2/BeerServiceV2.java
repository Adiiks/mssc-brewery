package pl.adiks.msscbrewery.service.v2;

import pl.adiks.msscbrewery.dto.v2.BeerDTOV2;

import java.util.UUID;

public interface BeerServiceV2 {
    BeerDTOV2 getBeerById(UUID beerId);

    BeerDTOV2 saveBeer(BeerDTOV2 beerDTO);

    void updateBeer(BeerDTOV2 beerDTO, UUID beerId);

    void deleteById(UUID beerId);
}
