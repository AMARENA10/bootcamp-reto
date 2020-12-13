package com.bootcamp.reto.persistence.entities;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "Tarjeta", schema = "dbo")
public class Tarjeta {
    @Id
    @Column(name = "tarjeta_id")
    private Integer id;
    @Column(name = "descripcion")
    private String descripcion;

}
