package com.bootcamp.reto.persistence.entities;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "CronogramaPago", schema = "dbo")
public class Cronograma {
    @Id
    @Column(name = "id_compra")
    private Integer idCompra;
    @Column(name = "couta")
    private Double couta;
    @Column(name = "fecha_pago")
    private Date fecha_pago;


}
