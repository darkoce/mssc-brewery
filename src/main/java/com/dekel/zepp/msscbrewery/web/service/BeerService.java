package com.dekel.zepp.msscbrewery.web.service;

import com.dekel.zepp.msscbrewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);

    BeerDto saveBeer(BeerDto beerDto);
}
