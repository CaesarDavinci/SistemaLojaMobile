package com.axis.SistemaLojaMobile.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.axis.SistemaLojaMobile.Domain.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{

	Optional<Categoria> findById(Integer id);
	
}
