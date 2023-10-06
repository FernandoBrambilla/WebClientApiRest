package com.fernando.Entities;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;



@Entity
@Table
public class ClientPJ extends Client implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Column (nullable = false)
	private String cnpj;
	
	@Column (nullable = false)
	private String inscEst;
	
	@ManyToOne
	private Bank bank;
	
	//CONSTUCTOR
	public ClientPJ(Integer id, String name, String cnpj, String inscEst, String phone, 
			String email, String address, String number,
			String complement, String city, String state, Bank bank) {
		super(id, name, phone, email, address, number, complement, city, state);
		this.cnpj = cnpj;
		this.inscEst = inscEst;
	}
	
	public ClientPJ() {
	}

	//GETTERS AND SETTERS
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getInscEst() {
		return inscEst;
	}

	public void setInscEst(String inscEst) {
		this.inscEst = inscEst;
	}

	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}

	//HASHCODE AND EQUALS
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(bank, cnpj, inscEst);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		ClientPJ other = (ClientPJ) obj;
		return Objects.equals(bank, other.bank) && Objects.equals(cnpj, other.cnpj)
				&& Objects.equals(inscEst, other.inscEst);
	}

}
