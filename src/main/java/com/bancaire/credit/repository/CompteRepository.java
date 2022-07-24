package com.bancaire.credit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bancaire.credit.model.Compte;

@Repository
public interface CompteRepository extends JpaRepository<Compte, String>{

}
