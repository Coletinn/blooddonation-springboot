package com.blood_donation_group.blooddonation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blood_donation_group.blooddonation.entities.Doador;

public interface DoadorRepository extends JpaRepository<Doador, Long>
{

}
