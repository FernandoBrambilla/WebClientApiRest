package com.fernando.Controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fernando.Entities.User;

@RestController
@RequestMapping (value = "/users")
public class UserController {
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<User> findAll(){
		
		User user1 = new User(null, "José da Silva", "jose@email.com", "4366778899", "1234");
		
		return ResponseEntity.ok().body(user1);
	}

}
