package com.fernando.Entities;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;



@Entity
@Table
public class ClientPJ extends Client implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Column (nullable = false)
	private String cnpj;
	
	@Column (nullable = false)
	private String inscEst;
	
	public ClientPJ(Integer id, String name, String cnpj, String inscEst, String phone, 
			String email, String address, String number,
			String complement, String city, String state, Bank bank) {
		super(id, name, phone, email, address, number, complement, city, state, bank);
		this.cnpj = cnpj;
		this.inscEst = inscEst;
	}

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



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(cnpj);
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
		return Objects.equals(cnpj, other.cnpj);
	}
	
	

}
