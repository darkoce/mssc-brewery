package com.dekel.zepp.msscbrewery.web.service.v2;

import com.dekel.zepp.msscbrewery.web.model.BeerDto;
import com.dekel.zepp.msscbrewery.web.model.v2.BeerDtoV2;
import com.dekel.zepp.msscbrewery.web.model.v2.BeerStyleEnum;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceV2Impl implements BeerServiceV2{
    @Override
    public BeerDtoV2 getBeerById(UUID beerId) {
        return BeerDtoV2.builder().id(UUID.randomUUID())
                .beerName("Friday")
                .beerStyle(BeerStyleEnum.LAGER)
                .build();
    }

    @Override
    public BeerDtoV2 saveBeer(BeerDtoV2 beerDto) {
        return null;
    }

    @Override
    public void updateBeer(UUID beerId, BeerDtoV2 beerDto) {

    }

    @Override
    public void deletreBeerById(UUID beerId) {

    }
}
