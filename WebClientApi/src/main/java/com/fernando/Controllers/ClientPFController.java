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
import com.fernando.Entities.ClientPF;
import com.fernando.services.ClientPFService;

@RestController
@RequestMapping(value = "/clientspf")
public class ClientPFController {

	@Autowired
	private ClientPFService service;

	
	//FindAll Controller
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public List<ClientPF> findAll(){
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
	public Client create(@RequestBody ClientPF clientPF) {
		return service.create(clientPF);	
	}
	
	//Update Controller
	@PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public Client update(@RequestBody ClientPF clientPF) {
		return service.update(clientPF);
	}
	
	//Delete Controller
	@DeleteMapping(value = "/{id}")
	public void delete(@PathVariable (value = "id") Integer id) {
		service.delete(id);
	}
	
}