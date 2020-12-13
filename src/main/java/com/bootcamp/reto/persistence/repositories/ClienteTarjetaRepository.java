package com.bootcamp.reto.persistence.repositories;

import com.bootcamp.reto.persistence.entities.Cliente;
import com.bootcamp.reto.persistence.entities.ClienteTarjeta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ClienteTarjetaRepository extends JpaRepository<ClienteTarjeta, Integer> {

    @Query("SELECT p FROM ClienteTarjeta p WHERE  cliente_id=:#{#clienteId}  and tarjeta_id=:#{#tarjetaId}  ")
    ClienteTarjeta find(Integer clienteId, Integer tarjetaId);
}
