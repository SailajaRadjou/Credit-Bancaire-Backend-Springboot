package com.bancaire.credit.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bancaire.credit.exception.ResourceNotFoundException;
import com.bancaire.credit.model.Client;
import com.bancaire.credit.repository.ClientRepository;


@CrossOrigin(origins = "http://localhost:4200")
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
	@GetMapping("/client/{nom}")
	public List<Client> getClientByName(@PathVariable String nom){
		return clientRepository.getByName(nom);
	}
		
	//add client
	@PostMapping("/clients")
	public Client createClient(@RequestBody Client client) {
		return clientRepository.save(client);
	}
	
	//get client by id
	@GetMapping("/clients/{id}")
	public ResponseEntity<Client> getClientById(@PathVariable int id) {
		Client client = clientRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Client not exist with this id : "+id));
		return ResponseEntity.ok(client);
	}	
	
	//update client details
	@PutMapping("/clients/{id}")
	public ResponseEntity<Client> updateClient(@PathVariable int id, @RequestBody Client clientUpdate){
		Client client = clientRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Client not exist with this id : "+id));
		client.setNom(clientUpdate.getNom());
		client.setPrenom(clientUpdate.getPrenom());
		client.setDateNaissance(clientUpdate.getDateNaissance());
		client.setAdresse(clientUpdate.getAdresse());
		client.setTel(clientUpdate.getTel());
		client.setMail(clientUpdate.getMail());
		client.setCivilite(clientUpdate.getCivilite());
		
		Client updatedClient = clientRepository.save(client);
		return ResponseEntity.ok(updatedClient);
	
	}
	
	//Delete Client
	@DeleteMapping("/clients/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteClient(@PathVariable int id){
		Client client = clientRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Client not exist with this id : "+id));
		clientRepository.delete(client);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}

}
