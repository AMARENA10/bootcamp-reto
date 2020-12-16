package com.bootcamp.reto.persistence.repositories;

import com.bootcamp.reto.persistence.entities.Cliente;
import com.bootcamp.reto.persistence.entities.Tea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TeaRepository extends JpaRepository<Tea, Integer> {

    @Query("SELECT p FROM Tea p WHERE tea =:#{#tea}  ")
    Tea find(String tea);
}
