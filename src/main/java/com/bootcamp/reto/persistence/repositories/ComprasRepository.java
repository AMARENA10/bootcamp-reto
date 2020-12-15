package com.bootcamp.reto.persistence.repositories;

import com.bootcamp.reto.persistence.entities.Cliente;
import com.bootcamp.reto.persistence.entities.Compras;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ComprasRepository extends JpaRepository<Compras, Integer> {

}
