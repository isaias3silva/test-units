package com.mmlogistica.testsUnits.mapper;

import com.mmlogistica.testsUnits.dto.BeerDTO;
import com.mmlogistica.testsUnits.entity.Beer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BeerMapper {
    BeerMapper INSTANCE = Mappers.getMapper(BeerMapper.class);

    Beer toModel(BeerDTO beerDTO);

    BeerDTO toDTO(Beer beer);
}
