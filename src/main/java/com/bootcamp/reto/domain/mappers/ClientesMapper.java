package com.bootcamp.reto.domain.mappers;

import com.bootcamp.reto.domain.dto.ClienteDto;
import com.bootcamp.reto.persistence.entities.Cliente;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ClientesMapper {


    ClienteDto toClienteDto(Cliente entity);
    List<ClienteDto> toClienteDto(List<ClienteDto> entities);

}
