package com.bootcamp.reto.domain.services;

import com.bootcamp.reto.domain.dto.SimuladorDto;
import com.bootcamp.reto.domain.dto.SimuladorResponse;

import java.util.List;

public interface SimuladorService {
    SimuladorDto findById(Integer id);

    List<SimuladorDto> findAll();

    SimuladorResponse simulate(SimuladorDto simuladorDto);
}
