package com.bootcamp.reto.domain.services;

import com.bootcamp.reto.domain.dto.ClienteDto;
import com.bootcamp.reto.domain.dto.ClienteTarjetaDto;

import java.util.List;

public interface ClientesTarjetaService {
    ClienteTarjetaDto findById(Integer id);
    ClienteTarjetaDto find(Integer clienteId,Integer tarjetaId );
    List<ClienteTarjetaDto> findAll();
}
