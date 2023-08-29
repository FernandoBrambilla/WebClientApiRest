package com.fernando.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fernando.Entities.Bank;
import com.fernando.Exceptions.ResourceNotFoundException;
import com.fernando.Repositories.BankRepository;

@Service
public class BankService {
	
	@Autowired
	BankRepository repository;
	
	//FindAll
	public List<Bank> findAll(){
		return repository.findAll();
	}
	
	//FindById
	public Bank findById(Integer id) {
		return repository.findById(id).orElseThrow(
				() -> new ResourceNotFoundException("No records found for this ID"));
	}
	
	//Create
	public Bank create(Bank bank) {
		return repository.save(bank);
	}
	
	//Update
	public Bank update(Bank bank) {
		Bank entity = repository.findById(bank.getId()).orElseThrow(
		() -> new ResourceNotFoundException("No records found for this ID"));
		entity.setName(bank.getName());
		entity.setAg(bank.getAg());
		entity.setAccount(bank.getAccount());
		entity.setAccountBankType(bank.getAccountBankType());
		return repository.save(entity);
	}
	
	//Delete
		public void delete(Integer id) {
			Bank entity = repository.findById(id).orElseThrow(
			() -> new ResourceNotFoundException("No records found for this ID"));
			repository.delete(entity);	
		}

}
