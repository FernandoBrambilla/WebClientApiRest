package com.fernando.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fernando.Entities.User;
import com.fernando.Exceptions.RequiredObjectIsNullException;
import com.fernando.Exceptions.ResourceNotFoundException;
import com.fernando.Repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository repository;

	// FindAll
	public List<User> findAll() {
		return repository.findAll();
	}

	// FindById
	public User findById(Integer id) {
		return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException());
	}

	// Create
	public User create(User user) {
		if (user == null)
			throw new RequiredObjectIsNullException();
		return repository.save(user);
	}

	// Update
	public User update(User user) {
		if (user == null)
			throw new RequiredObjectIsNullException();
		User entity = repository.findById(user.getId()).orElseThrow(() -> new ResourceNotFoundException());
		entity.setUser(user.getUser());
		entity.setEmail(user.getEmail());
		entity.setPhone(user.getPhone());
		entity.setPassword(user.getPassword());
		return repository.save(entity);
	}

	// Delete
	public void delete(Integer id) {
		User entity = repository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("No records found for this ID"));
		repository.delete(entity);

	}
}
