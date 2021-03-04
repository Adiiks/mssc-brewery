package pl.adiks.msscbrewery.mappers;

import org.mapstruct.Mapper;
import pl.adiks.msscbrewery.domain.Beer;
import pl.adiks.msscbrewery.dto.BeerDTO;

@Mapper
public interface BeerMapper {

    BeerDTO beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDTO beerDTO);
}
