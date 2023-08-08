package com.fernando.Controllers;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fernando.Entities.Client;
import com.fernando.services.ClientService;




@RestController
@RequestMapping(value = "/client")
public class ClientController {

	@Autowired
	private ClientService service;

	public List<Client> findAll(){
		List<Client> clients = new ArrayList<>();
		return clients;
		
		//TERMINAR AQUI
	}
	
	@GetMapping(value = "{id}",
            produces = MediaType.APPLICATION_JSON_VALUE)
	public Client findById(@PathVariable(value = "id") Integer id) {
		return service.findById(id);

	}
}