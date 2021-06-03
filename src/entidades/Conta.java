package entidades;

import exception.BusinessException;

public class Conta {
	private Integer numero;
	private String titular;
	private Double saldo;
	private Double limiteSaque;
	
	public Conta() {
		
	}
	
	public Conta(Integer numero, String titular, Double saldo, Double limiteSaque) {
		
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
		this.limiteSaque = limiteSaque;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Double getLimiteSaque() {
		return limiteSaque;
	}

	public void setLimiteSaque(Double limiteSaque) {
		this.limiteSaque = limiteSaque;
	}
	public void depositar(Double quantia) {
		saldo= saldo + quantia;
	}
	public void saque(Double quantia) {
		validarSaque(quantia);
		saldo = saldo - quantia;
	}
	private void  validarSaque(double quantia) {
		if (quantia > getLimiteSaque()) {
		throw new BusinessException("erro de saque: a quantia excede o limite de saque ");
			
		}
	   if(quantia > getSaldo()) {
		   throw new BusinessException("erro de saque: saldo insuficiente");
		}
	   
	}
	
	}












