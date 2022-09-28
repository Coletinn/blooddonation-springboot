package com.blood_donation_group.blooddonation.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.blood_donation_group.blooddonation.entities.Doador;
import com.blood_donation_group.blooddonation.repositories.DoadorRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner
{
	@Autowired
	private DoadorRepository doadorRepository;

	@Override
	public void run(String... args) throws Exception {
		Doador doador1 = new Doador(1L, "Alex", 41, "alex@gmail.com", "55.555.555-A", "555.555.555-55-44", "Masculino", "O");
		Doador doador2 = new Doador(2L, "Bob", 41, "bob@gmail.com", "66.666.666-B", "666.666.666-44", "Masculino", "B");
		
		doadorRepository.saveAll(Arrays.asList(doador1, doador2));
	}
}
