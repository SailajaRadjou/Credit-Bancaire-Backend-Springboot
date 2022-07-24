package com.bancaire.credit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bancaire.credit.model.Client;
import com.bancaire.credit.model.Compte;
import com.bancaire.credit.repository.ClientRepository;
import com.bancaire.credit.repository.CompteRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/")
public class CompteController {

	@Autowired
	private ClientRepository clientRepository;
	
	@Autowired
	private CompteRepository compteRepository;
	
	@GetMapping("/comptes")
	public List<Compte> getAllComptes(){
		return compteRepository.findAll();
	}
}
