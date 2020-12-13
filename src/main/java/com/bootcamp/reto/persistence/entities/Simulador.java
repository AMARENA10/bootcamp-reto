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
@Table(name = "ProductCategory", schema = "SalesLT")
public class Simulador {
    @Id
    @Column(name = "ProductCategoryID")
    private Integer id;
    @Column(name = "Dni")
    private Integer dni;
    @Column(name = "tipoTarjeta")
    private String tipotarjeta;
    @Column(name = "monto")
    private String monto;
    @Column(name = "ncoutas")
    private Integer ncoutas;
    @Column(name = "tasa")
    private Double tasa;
    @Column(name = "FechaPago")
    private Date fechapago;
    @Column(name = "rowguid")
    private String rowguid;


}
