package com.blood_donation_group.blooddonation.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blood_donation_group.blooddonation.entities.Doador;

@RestController
@RequestMapping(value = "/doadores")
public class DoadorResource 
{
	@GetMapping
	public ResponseEntity<Doador> findAll()
	{
		Doador doador = new Doador(1L, "Maria", 33, "maria@gmail.com", "33.333.333-Z", "333.333.333-33", "Feminino", "O");
		return ResponseEntity.ok().body(doador);
	}
}
