package com.axis.SistemaLojaMobile.dto;

import java.io.Serializable;

import com.axis.SistemaLojaMobile.Domain.Categoria;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CategoriaDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String nome;
	
	public CategoriaDTO(Categoria obj){
		id = obj.getId();
		nome = obj.getNome();
		
	}
}
