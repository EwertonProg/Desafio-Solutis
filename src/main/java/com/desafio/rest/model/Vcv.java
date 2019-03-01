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

	public void encontrarVogal() {
		long inicio = System.currentTimeMillis();
		String S = new String(entrada);
		S.toLowerCase();
		char[] letras = S.toCharArray();
		vogal = '\n';
		Integer a = 0, e = 0, i = 0, o = 0, u = 0;
		for (int c = 0; c < letras.length; c++) {
			switch (letras[c]) {

			case 'a':
				if (c > 1 && isConsoante(letras[c - 1]) && isVogal(letras[c])) {
					if (a < 1) {
						vogal = letras[c];
					} else if (this.vogal.equals(letras[c])) {
						vogal = '\n';
					}
				}
				a++;
				break;
			case 'e':
				if (c > 1 && isConsoante(letras[c - 1]) && isVogal(letras[c])) {
					if (e < 1) {
						vogal = letras[c];
					} else if (this.vogal.equals(letras[c])) {
						vogal = '\n';
					}
				}
				e++;
				break;
			case 'i':
				if (c > 1 && isConsoante(letras[c - 1]) && isVogal(letras[c])) {
					if (i < 1) {
						vogal = letras[c];
					} else if (this.vogal.equals(letras[c])) {
						vogal = '\n';
					}
				}
				i++;
				break;
			case 'o':
				if (c > 1 && isConsoante(letras[c - 1]) && isVogal(letras[c])) {
					if (o < 1) {
						vogal = letras[c];
					} else if (this.vogal.equals(letras[c])) {
						vogal = '\n';
					}
				}
				o++;
				break;
			case 'u':
				if (c > 1 && isConsoante(letras[c - 1]) && isVogal(letras[c])) {
					if (u < 1) {
						vogal = letras[c];
					} else if (this.vogal.equals(letras[c])) {
						vogal = '\n';
					}
				}
				u++;
				break;

			default:
				break;
			}
		}
		this.tempoTotal = System.currentTimeMillis() - inicio;
	}

	private static boolean isVogal(char c) {
		switch (c) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			return true;
		default:
			return false;
		}
	}

	private static boolean isNumero(char c) {
		try {
			Integer.parseInt(String.valueOf(c));

		} catch (Exception e) {
			return false;
		}
		return true;
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

	public Long getTempoTotal() {
		return tempoTotal;
	}

	public void setTempoTotal(Long tempoTotal) {
		this.tempoTotal = tempoTotal;
	}

}
