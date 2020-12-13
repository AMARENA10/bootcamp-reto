package com.bootcamp.reto.domain.services.impl;

import com.bootcamp.reto.domain.dto.SimuladorDto;
import com.bootcamp.reto.domain.dto.SimuladorResponse;
import com.bootcamp.reto.domain.mappers.ClientesMapper;
import com.bootcamp.reto.domain.mappers.SimuladoriesMapper;
import com.bootcamp.reto.domain.mappers.TarjetasMapper;
import com.bootcamp.reto.domain.services.SimuladorService;
import com.bootcamp.reto.persistence.entities.ClienteTarjeta;
import com.bootcamp.reto.persistence.repositories.ClienteRepository;
import com.bootcamp.reto.persistence.repositories.ClienteTarjetaRepository;
import com.bootcamp.reto.persistence.repositories.SimuladorRepository;
import com.bootcamp.reto.persistence.repositories.TarjetaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Service
public class SimuladorServiceImpl implements SimuladorService {

    @Autowired
    private SimuladorRepository simuladorRepository;

    @Autowired
    private SimuladoriesMapper simuladoriesMapper;

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private ClientesMapper clientesMapper;

    @Autowired
    private TarjetaRepository tarjetaRepository;

    @Autowired
    private TarjetasMapper tarjetasMapper;

    @Autowired
    private ClienteTarjetaRepository clienteTarjetaRepository;
    @Override
    public SimuladorDto findById(Integer id) {
        var category = this.simuladorRepository.findById(id).get();
        return this.simuladoriesMapper.toSimuladorDto(category);
    }

    @Override
    public List<SimuladorDto> findAll() {
        var categories = this.simuladorRepository.findAll();
        return this.simuladoriesMapper.toSimuladoriesDto(categories);
    }

    @Override
    public SimuladorResponse simulate(SimuladorDto simuladorDto) {
        SimuladorResponse simuladorResponse = new SimuladorResponse();

        var cliente = this.clienteRepository.find(simuladorDto.getDni());

        if (cliente != null) {

            var tarjeta= this.tarjetaRepository.find(simuladorDto.getTarjeta());

            if (tarjeta != null) {

                var clienteTarjeta=this.clienteTarjetaRepository.find(cliente.getId(),tarjeta.getId());

                if (clienteTarjeta != null)
                {
                    // 1. Hacer calculos
                    // 2. Registrar tablas
                    simuladorResponse.setEstado("exitoso");
                    simuladorResponse.setMoneda(simuladorDto.getMoneda());
                    simuladorResponse.setCouta(simuladorDto.getMonto()/simuladorDto.getCuota()*1.99);
                    var fecha = new Date();
                    simuladorResponse.setPrimeraCouta(fecha);
                } else
                {
                    simuladorResponse.setEstado("Tarjeta no pertenece al cliente");
                }


            }
            else{
                simuladorResponse.setEstado("Tarjeta no Registrado");
            }


        } else{
            simuladorResponse.setEstado("Cliente no Registrado");
        }









        return simuladorResponse;

    }


}
