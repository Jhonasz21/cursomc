package com.nelioalves.cursomc.domian;

import java.util.Date;

import javax.persistence.Entity;

import com.nelioalves.cursomc.domian.enums.EstadoPagamento;

@Entity
public class PagamentoComBoleto extends Pagamento {
	private static final long serialVersionUID = 1L; 

	
	private Date dataVencimento;
	private Date dataPagamneto;
	
	public PagamentoComBoleto ( ) {
		
	}

	public PagamentoComBoleto(Integer id, EstadoPagamento estado, Pedido pedido, Date dataVenciento, Date dataPagamento) {
		super(id, estado, pedido);
		this.dataPagamneto = dataPagamento;
		this.dataVencimento = dataVenciento;
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Date getDataPagamneto() {
		return dataPagamneto;
	}

	public void setDataPagamneto(Date dataPagamneto) {
		this.dataPagamneto = dataPagamneto;
	}
	
	
	
	
}
