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
	private long tempoTotal;

	public void encontrarVogal() {
		String S = new String(entrada.toLowerCase());
		char[] letras = S.toCharArray();
		vogal = '\n';
		boolean b = true;
		Integer a = 0, e = 0, i = 0, o = 0, u = 0;
		for (int c = 0; c < letras.length; c++) {
			switch (Character.toLowerCase(letras[c])) {

			case 'a':
				if (c > 1 && isConsoante(letras[c - 1]) && isVogal(letras[c - 2])) {
					if (a < 1 && b) {
						vogal = letras[c];
						b = false;
					} 
				}else if (this.vogal.equals(letras[c])) {
					vogal = '\n';
					b = true;
				}
				a++;
				break;
			case 'e':
				if (c > 1 && isConsoante(letras[c - 1]) && isVogal(letras[c - 2])) {
					if (e < 1 && b) {
						vogal = letras[c];
						b = false;
					} 
				}else if (this.vogal.equals(letras[c])) {
					vogal = '\n';
					b = true;
				}
				e++;
				break;
			case 'i':
				if (c > 1 && isConsoante(letras[c - 1]) && isVogal(letras[c - 2])) {
					if (i < 1 && b) {
						vogal = letras[c];
						b = false;
					} 
				}else if (this.vogal.equals(letras[c])) {
					vogal = '\n';
					b = true;
				}
				i++;
				break;
			case 'o':
				if (c > 1 && isConsoante(letras[c - 1]) && isVogal(letras[c - 2])) {
					if (o < 1 && b) {
						vogal = letras[c];
						b = false;
					} 
				}else if (this.vogal.equals(letras[c])) {
					vogal = '\n';
					b = true;
				}
				o++;
				break;
			case 'u':
				if (c > 1 && isConsoante(letras[c - 1]) && isVogal(letras[c - 2])) {
					if (u < 1 && b) {
						vogal = letras[c];
						b = false;
					} 
				}else if (this.vogal.equals(letras[c])) {
					vogal = '\n';
					b = true;
				}
				u++;
				break;

			default:
				break;
			}
		}
	}

	private static boolean isVogal(char c) {
		switch (c) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			return true;
		default:
			return false;
		}
	}

	private static boolean isNumero(char c) {
		
		return Character.isDigit(c);
	}

	private static boolean isConsoante(char c) {
		return !(isVogal(c) || isNumero(c));
	}

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

	public long getTempoTotal() {
		return tempoTotal;
	}

	public void setTempoTotal(long tempoTotal) {
		this.tempoTotal = tempoTotal;
	}

}
