package com.example.BackEndECommerce.persistence.repository;

import com.example.BackEndECommerce.persistence.entities.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto,Integer> {
}
