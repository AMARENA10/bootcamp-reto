package com.bootcamp.reto.domain.services;

import com.bootcamp.reto.domain.dto.ClienteDto;
import com.bootcamp.reto.domain.dto.CompraDto;

import java.util.List;

public interface ComprasService {
    CompraDto findById(Integer id);
    List<CompraDto> findAll();
}
