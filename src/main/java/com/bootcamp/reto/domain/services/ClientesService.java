package com.bootcamp.reto.domain.services;

import com.bootcamp.reto.domain.dto.ClienteDto;

import java.util.List;

public interface ClientesService {
    ClienteDto findById(Integer id);
    ClienteDto find(Integer dni);
    List<ClienteDto> findAll();
}
