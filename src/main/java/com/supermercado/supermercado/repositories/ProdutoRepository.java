package com.supermercado.supermercado.repositories;

import com.supermercado.supermercado.entities.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
