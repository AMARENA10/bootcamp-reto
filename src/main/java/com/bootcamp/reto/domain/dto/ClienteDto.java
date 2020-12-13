package com.bootcamp.reto.domain.dto;

import lombok.*;

import javax.persistence.Column;
import java.util.Date;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ClienteDto {

    private Integer id;
    private Integer dni;
    private String nombre;

}
