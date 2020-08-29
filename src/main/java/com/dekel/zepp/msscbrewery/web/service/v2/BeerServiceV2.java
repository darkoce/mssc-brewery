package com.dekel.zepp.msscbrewery.web.service.v2;

import com.dekel.zepp.msscbrewery.web.model.BeerDto;
import com.dekel.zepp.msscbrewery.web.model.v2.BeerDtoV2;

import java.util.UUID;

public interface BeerServiceV2 {
    BeerDtoV2 getBeerById(UUID beerId);

    BeerDtoV2 saveBeer(BeerDtoV2 beerDto);

    void updateBeer(UUID beerId, BeerDtoV2 beerDto);

    void deletreBeerById(UUID beerId);
}
