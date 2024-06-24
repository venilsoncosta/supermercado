package com.supermercado.supermercado.repositories;

import com.supermercado.supermercado.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
