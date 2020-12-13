package com.bootcamp.reto.domain.mappers;

import com.bootcamp.reto.domain.dto.SimuladorDto;
import com.bootcamp.reto.persistence.entities.Simulador;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SimuladoriesMapper {

    SimuladorDto toSimuladorDto(Simulador entity);
    List<SimuladorDto> toSimuladoriesDto(List<Simulador> entities);

}
