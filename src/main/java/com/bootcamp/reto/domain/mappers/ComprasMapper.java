package com.bootcamp.reto.domain.mappers;

import com.bootcamp.reto.domain.dto.ClienteDto;
import com.bootcamp.reto.domain.dto.CompraDto;
import com.bootcamp.reto.persistence.entities.Cliente;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ComprasMapper {


    CompraDto toCompraDto(Cliente entity);
    List<CompraDto> totoCompraDto(List<CompraDto> entities);

}
