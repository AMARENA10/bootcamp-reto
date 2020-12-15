package com.bootcamp.reto.domain.dto;

import lombok.*;

import java.sql.Date;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CompraDto {

    private Integer idCompra;
    private Integer idCliente;
    private Integer idTarjeta;
    private Date    fechaCompra;
    private Double monto;
    private Double montoCalculado;
    private Integer ncoutas;
    private String moneda;

}
