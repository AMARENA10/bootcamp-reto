package com.bootcamp.reto.domain.mappers;

import com.bootcamp.reto.domain.dto.CompraDto;
import com.bootcamp.reto.domain.dto.CronogramaDto;
import com.bootcamp.reto.persistence.entities.Cliente;
import com.bootcamp.reto.persistence.entities.Cronograma;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CronogramasMapper {


    CronogramaDto toCronogramaDto(Cronograma entity);
    List<CronogramaDto> toCronogramaDto(List<CronogramaDto> entities);

}
