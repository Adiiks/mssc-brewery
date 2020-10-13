package pl.adiks.msscbrewery.service;

import org.springframework.stereotype.Service;
import pl.adiks.msscbrewery.dto.BeerDTO;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService {

    @Override
    public BeerDTO getBeerById(UUID beerId) {
        return BeerDTO.builder().id(UUID.randomUUID())
                .beerName("Tyskie")
                .beerStyle("Najlepsze")
                .build();
    }

    @Override
    public BeerDTO saveBeer(BeerDTO beerDTO) {
        return BeerDTO.builder()
                .id(UUID.randomUUID())
                .build();
    }

}
