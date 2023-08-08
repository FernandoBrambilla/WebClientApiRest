package com.fernando.services;

import java.util.Date;

import org.springframework.stereotype.Service;

import com.fernando.Entities.Bank;
import com.fernando.Entities.Client;
import com.fernando.Entities.ClientPF;
import com.fernando.Enums.AccountBankType;

@Service
public class ClientService {

	public Client findById(Integer id) {
		
		Client clientePf = new ClientPF(null, "Fernando", "43991545356", "fernando@email.com", 
				"Rua cinco", "160","casa", "Marumbi", "Paraná", "06112345678", new Date(), 
				"12345678", new Date(), new Bank(null, "Sicredi",
				AccountBankType.CORRENTE.getDescricao(),"0736","484599"));
		return clientePf;
	}
}
