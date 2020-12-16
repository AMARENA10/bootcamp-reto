package com.bootcamp.reto.domain.services.impl;

import com.bootcamp.reto.domain.dto.SimuladorRequest;
import com.bootcamp.reto.domain.dto.SimuladorResponse;
import com.bootcamp.reto.domain.dto.TeaDto;
import com.bootcamp.reto.domain.mappers.SimuladorResponseMapper;
import com.bootcamp.reto.domain.services.SimuladorService;
import com.bootcamp.reto.persistence.entities.Simulador;
import com.bootcamp.reto.persistence.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.UUID;

@Service
public class SimuladorServiceImpl implements SimuladorService {

    @Autowired
    private SimuladorRepository simuladorRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private TarjetaRepository tarjetaRepository;

    @Autowired
    private ClienteTarjetaRepository clienteTarjetaRepository;

    @Autowired
    private TeaRepository teaRepository;

    @Autowired
    private SimuladorResponseMapper simuladorResponseMapper;


    @Override
    public Simulador save(SimuladorResponse simuladorResponse)
    {
        var simuladorSave = this.simuladorResponseMapper.toSimuladorResponse(simuladorResponse);

        return this.simuladorRepository.save(simuladorSave);
    }

    @Override
    public SimuladorResponse simulate(SimuladorRequest simuladorRequest) {

        SimuladorResponse simuladorResponse = new SimuladorResponse();

        var cliente = this.clienteRepository.find(simuladorRequest.getDni());

        if (cliente != null) {

            var tarjeta= this.tarjetaRepository.find(simuladorRequest.getTarjeta());

            if (tarjeta != null) {

                var clienteTarjeta=this.clienteTarjetaRepository.find(cliente.getId(),tarjeta.getId());


                if (clienteTarjeta != null)
                {
                    var tea= this.teaRepository.find(simuladorRequest.getTea());



                    if(tea != null)
                    {
                        long id =this.simuladorRepository.count();
                        int dato = (int) id;
                        // 1. Hacer calculos
                        simuladorResponse.setSimuladorId(dato+1);
                        simuladorResponse.setEstado("exitoso");
                        simuladorResponse.setMoneda(simuladorRequest.getMoneda());
                        simuladorResponse.setCuota((simuladorRequest.getMonto()* (tea.getValor()/100+1))/simuladorRequest.getCuota());
                        var fecha = new Date();
                        simuladorResponse.setPrimeraCouta("2021-01-15");

                        // 2. Registrar tablas
                        save(simuladorResponse);


                    }
                    else
                    {
                        simuladorResponse.setEstado("Tea no existe");
                    }

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
