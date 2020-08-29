package com.dekel.zepp.msscbrewery.web.controller.v2;

import com.dekel.zepp.msscbrewery.web.model.v2.BeerDtoV2;
import com.dekel.zepp.msscbrewery.web.service.v2.BeerServiceV2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("/api/v2/beer")
@RestController
public class BeerControllerV2 {

    private final BeerServiceV2 beerServiceV2;

    @Autowired
    public BeerControllerV2(BeerServiceV2 beerServiceV2) {
        this.beerServiceV2 = beerServiceV2;
    }

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDtoV2> getBeer(@PathVariable("beerId") UUID beerId){
        return new ResponseEntity<>(beerServiceV2.getBeerById(beerId), HttpStatus.OK);
    }

    @PostMapping //create new beer
    public ResponseEntity handlePost(@RequestBody BeerDtoV2 beerDtoV2){
        BeerDtoV2 savedBeerDto = beerServiceV2.saveBeer(beerDtoV2);
        HttpHeaders headers = new HttpHeaders();
        // todo add hostname to url
        headers.add("Location", "/api/v1/beer/" + savedBeerDto.getId().toString());
        return new ResponseEntity(headers, HttpStatus.CREATED);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity handleUpdate(@PathVariable("beerId") UUID beerId, @RequestBody BeerDtoV2 beerDto){
        beerServiceV2.updateBeer(beerId, beerDto);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/{beerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteBeer(@PathVariable("beerId") UUID beerId){
        beerServiceV2.deletreBeerById(beerId);
    }
}
