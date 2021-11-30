package com.example.BackEndECommerce.persistence.repository;

import com.example.BackEndECommerce.persistence.entities.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria,Integer> {
}
