package com.fernando.Controllers;

import java.util.Date;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fernando.Entities.Client;
import com.fernando.Entities.ClientPF;

@RestController
@RequestMapping(value = "/clients")
public class ClientController {

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<Client> findAll() {

		Client clientePf = new ClientPF(null, "Fernando", "43991545356", "fernando@email.com", "Rua cinco", "160",
				"casa", "Marumbi", "Paraná", "12345678900", new Date(), "12345678", new Date());
		return ResponseEntity.ok().body(clientePf);

	}

}