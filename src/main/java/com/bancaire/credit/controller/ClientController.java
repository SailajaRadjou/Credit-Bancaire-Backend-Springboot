package com.bancaire.credit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bancaire.credit.model.Client;
import com.bancaire.credit.repository.ClientRepository;

@RestController
@RequestMapping("/api/")
public class ClientController {
	
	@Autowired
	private ClientRepository clientRepository;
	
	//list all clients
	@GetMapping("/clients")
	public List<Client> getAllClients(){
		return clientRepository.findAll();
	}

}
