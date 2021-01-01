package com.axis.SistemaLojaMobile.Domain;

import javax.persistence.Entity;

import com.axis.SistemaLojaMobile.Domain.enums.EstadoPagamento;

import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class PagamentoComCartao extends Pagamento{
	private static final long serialVersionUID = 1L;
	
	private Integer numerodeParcelas;

	public PagamentoComCartao(Integer id, EstadoPagamento estado, Pedido pedido, 
			Integer numerodeParcelas) {
		super(id, estado, pedido);
		this.numerodeParcelas = numerodeParcelas;
	}

	public Integer getNumerodeParcelas() {
		return numerodeParcelas;
	}

	public void setNumerodeParcelas(Integer numerodeParcelas) {
		this.numerodeParcelas = numerodeParcelas;
	}
	
	
}
