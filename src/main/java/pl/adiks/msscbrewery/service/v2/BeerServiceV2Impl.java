package pl.adiks.msscbrewery.service.v2;

import org.springframework.stereotype.Service;
import pl.adiks.msscbrewery.dto.v2.BeerDTOV2;

import java.util.UUID;

@Service
public class BeerServiceV2Impl implements BeerServiceV2 {
    @Override
    public BeerDTOV2 getBeerById(UUID beerId) {
        return null;
    }

    @Override
    public BeerDTOV2 saveBeer(BeerDTOV2 beerDTO) {
        return null;
    }

    @Override
    public void updateBeer(BeerDTOV2 beerDTO, UUID beerId) {

    }

    @Override
    public void deleteById(UUID beerId) {

    }
}
