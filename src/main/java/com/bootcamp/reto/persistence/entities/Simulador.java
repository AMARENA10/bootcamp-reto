package com.bootcamp.reto.persistence.entities;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Builder
@Table(name = "Simulador", schema = "dbo")
public class Simulador {
    @Id
    @Column(name = "simulador_id")
    private Integer  simuladorId;
    @Column(name = "cuota")
    private Double cuota;
    @Column(name = "moneda")
    private String moneda;
    @Column(name = "primera_cuota")
    private String primeraCouta;
    @Column(name = "estado")
    private String estado;


}
