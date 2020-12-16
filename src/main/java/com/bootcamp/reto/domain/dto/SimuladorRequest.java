package com.bootcamp.reto.domain.dto;

import lombok.*;

import javax.persistence.Column;
import java.util.Date;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SimuladorRequest {


    private Integer id;
    private Integer dni;
    private String tarjeta;
    private String moneda;
    private Double monto;
    private Integer cuota;
    private String tea;
    private Date diaPago;

}
