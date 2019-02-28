package com.desafio.rest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vcv {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	private String entrada;
	private Character vogal;
	private Long tempoTotal;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEntrada() {
		return entrada;
	}
	public void setEntrada(String entrada) {
		this.entrada = entrada;
	}
	public Character getVogal() {
		return vogal;
	}
	public void setVogal(Character vogal) {
		this.vogal = vogal;
	}
	public Long getTempoTotal() {
		return tempoTotal;
	}
	public void setTempoTotal(Long tempoTotal) {
		this.tempoTotal = tempoTotal;
	}
	
	
}
