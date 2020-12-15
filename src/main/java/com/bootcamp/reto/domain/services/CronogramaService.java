package com.bootcamp.reto.domain.services;

import com.bootcamp.reto.domain.dto.CompraDto;
import com.bootcamp.reto.domain.dto.CronogramaDto;

import java.util.List;

public interface CronogramaService {
    CronogramaDto findById(Integer id);
    List<CronogramaDto> findAll();
}
