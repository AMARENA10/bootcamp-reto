package com.bootcamp.reto.domain.dto;

import lombok.*;

import java.util.Date;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class TeaDto {

    private Integer teaId;
    private String tea;
    private Double valor;

}
