package com.bootcamp.reto.domain.dto;

import lombok.*;

import java.util.Date;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SimuladorResponse {

    private Integer simuladorId;
    private Double cuota;
    private String moneda;
    private String primeraCouta;
    private String estado;

}
