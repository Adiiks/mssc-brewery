package pl.adiks.msscbrewery.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeervoDTO {

    private UUID id;
    private String beerName;
    private String beerStyle;
    private Long upc;
}
