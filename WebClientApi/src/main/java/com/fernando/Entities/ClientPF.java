package com.fernando.Entities;

import java.util.Date;

public class ClientPF extends Client {
	
	
	private String cpf;
	private Date dateNasc;
	private String rg;
	private Date dateExp;
	
	public ClientPF(Integer id, String name, String phone, String email, String address, 
			String number, String complement, String city, String state, String cpf,
			Date dateNasc, String rg, Date dateExp) {
			super(id, name, phone, email, address, number, complement, city, state);
			this.cpf = cpf;
			this.dateNasc = dateNasc;
			this.rg = rg;
			this.dateExp = dateExp;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getDateNasc() {
		return dateNasc;
	}

	public void setDateNasc(Date dateNasc) {
		this.dateNasc = dateNasc;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public Date getDateExp() {
		return dateExp;
	}

	public void setDateExp(Date dateExp) {
		this.dateExp = dateExp;
	}

	
}