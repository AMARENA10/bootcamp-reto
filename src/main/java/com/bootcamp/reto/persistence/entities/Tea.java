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
@Table(name = "Teac", schema = "dbo")
public class Tea {
    @Id
    @Column(name = "tea_id")
    private Integer teaId;
    @Column(name = "tea")
    private String tea;
    @Column(name = "valor")
    private Double valor;

}
