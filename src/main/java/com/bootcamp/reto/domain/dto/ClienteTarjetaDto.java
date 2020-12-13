package com.bootcamp.reto.domain.dto;

import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ClienteTarjetaDto {

    private Integer clienteId;
    private Integer tarjetaId;

}
