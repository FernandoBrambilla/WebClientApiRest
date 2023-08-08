package com.fernando.Controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fernando.Entities.Bank;
import com.fernando.Enums.AccountBankType;

@RestController
@RequestMapping(value = "/banks")
public class BankController {
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<Bank> findAll(){
		
		Bank bank1 = new Bank(null, "Caixa Economica", AccountBankType.CORRENTE.getDescricao(), 
				"1264", "123456");
		
		return ResponseEntity.ok().body(bank1);
	}

}
