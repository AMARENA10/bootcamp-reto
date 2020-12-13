package com.bootcamp.reto.domain.dto;

import lombok.*;

import java.util.Date;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SimuladorResponse {

    private Double couta;
    private String moneda;
    private Date primeraCouta;
    private String estado;


}
