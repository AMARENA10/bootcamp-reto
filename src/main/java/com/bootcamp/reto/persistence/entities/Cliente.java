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
@Builder
@Entity
@Table(name = "Cliente", schema = "dbo")
public class Cliente {
    @Id
    @Column(name = "cliente_id")
    private Integer id;
    @Column(name = "dni")
    private Integer dni;
    @Column(name = "nombre")
    private String nombre;

}
