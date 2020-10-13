package pl.adiks.msscbrewery.service;

import org.springframework.stereotype.Service;
import pl.adiks.msscbrewery.dto.BeervoDTO;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService {

    @Override
    public BeervoDTO getBeerById(UUID beerId) {
        return BeervoDTO.builder().id(UUID.randomUUID())
                .beerName("Tyskie")
                .beerStyle("Najlepsze")
                .build();
    }

    @Override
    public BeervoDTO saveBeer(BeervoDTO beerDTO) {
        return BeervoDTO.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateBeer(BeervoDTO beerDTO, UUID beerId) {
    }

}
