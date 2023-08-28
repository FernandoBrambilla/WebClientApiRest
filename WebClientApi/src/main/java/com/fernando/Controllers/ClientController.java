package com.fernando.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fernando.Entities.Client;
import com.fernando.services.ClientService;




@RestController
@RequestMapping(value = "/client")
public class ClientController {

	@Autowired
	private ClientService service;

	
	//FindAll Controller
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Client> findAll(){
		return service.findAll();
	}
	
	//FindById Controller
	@GetMapping(value = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
	public Client findById(@PathVariable(value = "id") Integer id) {
		return service.findById(id);
	}
	
	//Create Controller
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public Client create(@RequestBody Client client) {
		return service.create(client);	
	}
	
	//Update Controller
	@PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public Client update(@RequestBody Client client) {
		return service.update(client);
	}
	
	//Delete Controller
	@DeleteMapping(value = "/{id}")
	public void delete(@PathVariable (value = "id") Integer id) {
		service.delete(id);
	}
	
}