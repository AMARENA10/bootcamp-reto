package com.bootcamp.reto.persistence.repositories;

import com.bootcamp.reto.persistence.entities.Cliente;
import com.bootcamp.reto.persistence.entities.Tarjeta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TarjetaRepository extends JpaRepository<Tarjeta, Integer> {

    @Query("SELECT p FROM Tarjeta p WHERE descripcion = :#{#descripcion} ")
    Tarjeta find(String descripcion);
}
