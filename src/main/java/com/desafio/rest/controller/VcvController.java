package com.desafio.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desafio.rest.model.Vcv;
import com.desafio.rest.repository.Vcvs;

@RestController
@RequestMapping("/vcv")
public class VcvController {

	@Autowired
	private Vcvs vcvs;

	@PostMapping
	public Vcv encontrar(@RequestBody Vcv entrada) {
		return vcvs.save(entrada);
	}
}
