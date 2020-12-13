package com.bootcamp.reto.domain.services;

import com.bootcamp.reto.domain.dto.ClienteDto;

import java.util.List;

public interface TarjetasService {
    ClienteDto findById(Integer id);
    ClienteDto find(String descripcion);
    List<ClienteDto> findAll();
}
