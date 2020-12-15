package com.bootcamp.reto.domain.dto;

import lombok.*;

import java.sql.Date;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CronogramaDto {

    private Integer idCompra;
    private Double couta;
    private Date    fechaPago;


}
