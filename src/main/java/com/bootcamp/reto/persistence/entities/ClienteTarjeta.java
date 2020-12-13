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
@Table(name = "ClienteTarjeta", schema = "dbo")
public class ClienteTarjeta {
    @Id
    @Column(name = "cliente_id")
    private Integer clienteId;
    @Column(name = "tarjeta_id")
    private Integer tarjetaId;


}
