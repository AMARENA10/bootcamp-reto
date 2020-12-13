package com.bootcamp.reto.persistence.repositories;

import com.bootcamp.reto.persistence.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

    @Query("SELECT p FROM Cliente p WHERE dni =:#{#dni}  ")
    Cliente find(Integer dni);
}
