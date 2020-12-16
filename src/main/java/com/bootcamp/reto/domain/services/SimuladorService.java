package com.bootcamp.reto.domain.services;

import com.bootcamp.reto.domain.dto.SimuladorRequest;
import com.bootcamp.reto.domain.dto.SimuladorResponse;
import com.bootcamp.reto.persistence.entities.Simulador;

import java.util.List;

public interface SimuladorService {

    Simulador save(SimuladorResponse simuladorResponse);

    SimuladorResponse simulate(SimuladorRequest simuladorRequest);
}
