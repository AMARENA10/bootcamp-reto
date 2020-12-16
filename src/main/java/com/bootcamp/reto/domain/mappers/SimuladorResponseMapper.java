package com.bootcamp.reto.domain.mappers;

import com.bootcamp.reto.domain.dto.ClienteDto;
import com.bootcamp.reto.domain.dto.SimuladorResponse;
import com.bootcamp.reto.persistence.entities.Cliente;
import com.bootcamp.reto.persistence.entities.Simulador;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SimuladorResponseMapper {


    Simulador toSimuladorResponse( SimuladorResponse entity);
    List<SimuladorResponse> toClienteDto(List<SimuladorResponse> entities);

}
