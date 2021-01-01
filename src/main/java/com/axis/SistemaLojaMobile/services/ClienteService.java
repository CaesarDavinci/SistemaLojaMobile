package com.axis.SistemaLojaMobile.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axis.SistemaLojaMobile.Domain.Cliente;
import com.axis.SistemaLojaMobile.repositories.ClienteRepository;
import com.axis.SistemaLojaMobile.services.exception.ObjectNotFoundException;




@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repo;
	
	public Cliente find(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));
	}
}
