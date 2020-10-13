package pl.adiks.msscbrewery.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.adiks.msscbrewery.dto.BeerDTO;
import pl.adiks.msscbrewery.service.BeerService;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/beer")
public class BeerController {

    private final BeerService beerService;

    public BeerController(BeerService beerService) {
        this.beerService = beerService;
    }

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDTO> getBeer(@PathVariable UUID beerId) {

        return new ResponseEntity<>(beerService.getBeerById(beerId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity createBeer(BeerDTO beerDTO) {

        BeerDTO savedBeer = beerService.saveBeer(beerDTO);

        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", "/api/v1/beer/" + savedBeer.getId().toString());

        return new ResponseEntity<>(headers, HttpStatus.CREATED);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity updateBeer(BeerDTO beerDTO, @PathVariable UUID beerId) {

        beerService.updateBeer(beerDTO, beerId);

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
