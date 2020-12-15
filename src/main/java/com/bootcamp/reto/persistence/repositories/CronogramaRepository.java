package com.bootcamp.reto.persistence.repositories;

import com.bootcamp.reto.persistence.entities.Compras;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CronogramaRepository extends JpaRepository<Compras, Integer> {

}
