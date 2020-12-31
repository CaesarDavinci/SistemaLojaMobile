package com.axis.SistemaLojaMobile.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axis.SistemaLojaMobile.Domain.Categoria;
import com.axis.SistemaLojaMobile.repositories.CategoriaRepository;
import com.axis.SistemaLojaMobile.services.exception.ObjectNotFoundException;




@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria find(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
	}
}
