package com.fernando.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fernando.Entities.Client;
import com.fernando.Exceptions.ResourceNotFoundException;
import com.fernando.Repositories.ClientRepository;

@Service
public class ClientService {

	@Autowired
	ClientRepository repository;
	
	
	//FindAll
	public List<Client> findAll() {
		return repository.findAll();
	}
	
	//FindById
	public Client findById(Integer id) {
		return repository.findById(id).orElseThrow(
				() -> new ResourceNotFoundException("No records found for this ID"));
		}
	
	//Create
	public Client create (Client client) {
		return repository.save(client);
	}
	
	//Update
	public Client update (Client client) {
		Client entity = repository.findById(client.getId()).orElseThrow(
				() -> new ResourceNotFoundException("No records found for this ID"));
		return repository.save(entity);
	}
	
	//Delete
	public void delete(Integer id) {
		Client entity = repository.findById(id).orElseThrow(
				() -> new ResourceNotFoundException("No records found for this ID"));
		repository.delete(entity);
		
	}
}
