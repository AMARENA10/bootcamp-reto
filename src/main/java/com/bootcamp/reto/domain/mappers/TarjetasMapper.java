package com.bootcamp.reto.domain.mappers;

import com.bootcamp.reto.domain.dto.ClienteDto;
import com.bootcamp.reto.domain.dto.TarjetaDto;
import com.bootcamp.reto.persistence.entities.Cliente;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TarjetasMapper {


    TarjetaDto toTarjetaDto(Cliente entity);
    List<TarjetaDto> toTarjetaDto(List<TarjetaDto> entities);

}
