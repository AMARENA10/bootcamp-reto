package com.bootcamp.reto.domain.mappers;

import com.bootcamp.reto.domain.dto.ClienteDto;
import com.bootcamp.reto.domain.dto.ClienteTarjetaDto;
import com.bootcamp.reto.persistence.entities.Cliente;
import com.bootcamp.reto.persistence.entities.ClienteTarjeta;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ClientesTarjetasMapper {


    ClienteTarjetaDto toClienteTarjetaDto(ClienteTarjeta entity);
    List<ClienteTarjetaDto> toClienteTarjetaDto(List<ClienteTarjetaDto> entities);

}
