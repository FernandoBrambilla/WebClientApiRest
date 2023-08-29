package com.fernando.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fernando.Entities.Client;
import com.fernando.Entities.ClientPF;
import com.fernando.Exceptions.ResourceNotFoundException;
import com.fernando.Repositories.ClientPFRepository;

@Service
public class ClientPFService {

	@Autowired
	ClientPFRepository repository;
		
	//FindAll
	public List<ClientPF> findAll() {
		return repository.findAll();
	}
	
	//FindById
	public Client findById(Integer id) {
		return repository.findById(id).orElseThrow(
				() -> new ResourceNotFoundException("No records found for this ID"));
	}
	
	//Create
	public Client create (ClientPF clientPF) {
		return repository.save(clientPF);
	}
	
	//Update
	public Client update (ClientPF clientPF) {
		ClientPF entity = repository.findById(clientPF.getClientId()).orElseThrow(
		() -> new ResourceNotFoundException("No records found for this ID"));
		entity.setName(clientPF.getName());
		entity.setCpf(clientPF.getCpf());
		entity.setPhone(clientPF.getPhone());
		entity.setEmail(clientPF.getEmail());
		entity.setDateNasc(clientPF.getDateNasc());
		entity.setRg(clientPF.getRg());
		entity.setDateExp(clientPF.getDateExp());
		entity.setAddress(clientPF.getAddress());
		entity.setNumber(clientPF.getNumber());
		entity.setComplement(clientPF.getComplement());
		entity.setCity(clientPF.getCity());
		entity.setState(clientPF.getState());
		entity.setBank(clientPF.getBank());
		return repository.save(entity);
	}
	
	//Delete
	public void delete(Integer id) {
		ClientPF entity = repository.findById(id).orElseThrow(
		() -> new ResourceNotFoundException("No records found for this ID"));
		repository.delete(entity);
	}
}