package com.fernando.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fernando.Entities.User;
import com.fernando.Exceptions.ResourceNotFoundException;
import com.fernando.Repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository repository;
	
	//FindAll
	public List<User> findAll(){
		return repository.findAll();
	}
	
	//FindById
	public User findById(Integer id) {
		return repository.findById(id).orElseThrow(
				() -> new ResourceNotFoundException("No records found for this ID"));
	}
	
	//Create
	public User create(User user) {
		return repository.save(user);
	}
	
	//Update
	public User update(User user) {
		User entity = repository.findById(user.getId()).orElseThrow(
		() -> new ResourceNotFoundException("No records found for this ID"));
		return repository.save(entity);
	}
	
	//Delete
		public void delete(Integer id) {
			User entity = repository.findById(id).orElseThrow(
			() -> new ResourceNotFoundException("No records found for this ID"));
			repository.delete(entity);	
		}
}
