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
@Table(name = "ComprasC", schema = "dbo")
public class Compras {
    @Id
    @Column(name = "id_compra")
    private Integer idCompra;
    @Column(name = "id_cliente")
    private Integer idCliente;
    @Column(name = "id_tarjeta")
    private Integer idTarjeta;
    @Column(name = "fecha_compra")
    private Date fechaCompra;
    @Column(name = "monto")
    private Double monto;
    @Column(name = "monto_calculado")
    private Double montoCalculado;
    @Column(name = "ncoutas")
    private Integer ncoutas;
    @Column(name = "moneda")
    private String moneda;



}
