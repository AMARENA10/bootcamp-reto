package com.bootcamp.reto.domain.services;

import com.bootcamp.reto.domain.dto.ClienteDto;
import com.bootcamp.reto.domain.dto.TeaDto;

import java.util.List;

public interface TeasService {
    TeaDto findById(Integer id);
    TeaDto find(String tea);
    List<TeaDto> findAll();
}
