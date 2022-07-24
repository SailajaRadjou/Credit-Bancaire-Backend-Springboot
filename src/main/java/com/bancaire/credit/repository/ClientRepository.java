package com.bancaire.credit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bancaire.credit.model.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer>{

	@Query("From Client WHERE nom=:nom")
	List<Client> getByName(String nom);
}
