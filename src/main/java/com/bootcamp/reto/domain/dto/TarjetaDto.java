package com.bootcamp.reto.domain.dto;

import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TarjetaDto {

    private Integer id;
    private String descripcion;

}
