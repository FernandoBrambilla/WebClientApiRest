package com.fernando.Controllers;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fernando.Entities.User;

@RestController
public class UserController {
	
	@RequestMapping(value = "/users", method = RequestMethod.GET)
	public ResponseEntity<User> findAll(){
		
		User user1 = new User(null, "José da Silva", "jose@email.com", "4366778899", "1234");
		
	return ResponseEntity.ok().body(user1);
	
	}
	
	@RequestMapping (value = "/user/{name}/{email}/{phone}/{password}",
	method = RequestMethod.GET)
	public ResponseEntity<User> insertUser(
			@PathVariable (value = "name") String name,
			@PathVariable (value = "email") String email,
			@PathVariable (value = "phone") String phone,
			@PathVariable (value = "password") String password
			) {
			
			User user = new User (null,name,email,phone,password);
			
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence");
			EntityManager em = emf.createEntityManager();
			em.getTransaction().begin();
			em.persist(user);
			em.getTransaction().commit();
			em.close();
			return ResponseEntity.ok().body(user);
}
}
