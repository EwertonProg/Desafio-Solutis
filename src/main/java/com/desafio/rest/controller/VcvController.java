package com.desafio.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desafio.rest.model.Vcv;
import com.desafio.rest.repository.Vcvs;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/vcv")
public class VcvController {

	@Autowired
	private Vcvs vcvs;
	
	long inicio;
	
	@PostMapping
	public Vcv adicionar(@RequestBody Vcv entrada) {
		inicio = System.currentTimeMillis();
		System.out.println(entrada.getEntrada());
		entrada.encontrarVogal();
		entrada.setTempoTotal(System.currentTimeMillis() - inicio);
		return vcvs.save(entrada);
	}

	@GetMapping()
	public List<Vcv> listar() {
		return vcvs.findAll();
	}
}
