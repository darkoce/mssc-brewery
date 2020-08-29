package com.dekel.zepp.msscbrewery.web.mappers;

import com.dekel.zepp.msscbrewery.domain.Beer;
import com.dekel.zepp.msscbrewery.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper
public interface BeerMapper {
    BeerDto BeerToBeerDto(Beer beer);
    Beer BeerDtoToBeer(BeerDto dto);
}
