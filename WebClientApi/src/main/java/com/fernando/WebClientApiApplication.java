package com.fernando;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fernando.Entities.Bank;
import com.fernando.Entities.Client;
import com.fernando.Entities.ClientPF;
import com.fernando.Entities.ClientPJ;
import com.fernando.Enums.AccountBankType;
import com.fernando.Enums.State;

@SpringBootApplication
public class WebClientApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebClientApiApplication.class, args);
		
		Bank banco1 = new Bank(null, "Sicredi",AccountBankType.CORRENTE.getDescricao(), 
				"0736","45455");
		
		Client clientePf = new ClientPF(null, "Fernando", "43991545356", "fernando@email.com", 
				"Rua cinco", "160","casa", "Marumbi", State.PARANA.getDescricao(), "06112345678", new Date(), 
				"12345678", new Date(), banco1);
		
		Client clientPJ = new ClientPJ(null, "Brambilla Informatica","09623346000110",
				"4345454" ,"4334411356", "informaticabrambilla@gmail.com",
				"Av Presidente Vargas","192", "Centro", "Marumbi", State.PARANA.getDescricao(),
				banco1);
		
	
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(clientePf);
		em.persist(clientPJ);
		em.persist(banco1);
		em.getTransaction().commit();
		em.close();

		
		
	}

}
