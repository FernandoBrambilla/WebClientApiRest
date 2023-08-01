package com.fernando.entities;

import java.util.Date;

public class clientPF extends client {
	
	
	private Integer cpf;
	private Date dateBorn;
	private String rg;
	private Date dateExp;
	
	public clientPF(Integer id, String name, String phone, String email, String address, String number,
			String complement, String city, String state) {
			super(id, name, phone, email, address, number, complement, city, state);
	}

	public Integer getCpf() {
		return cpf;
	}

	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}

	public Date getDateBorn() {
		return dateBorn;
	}

	public void setDateBorn(Date dateBorn) {
		this.dateBorn = dateBorn;
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
