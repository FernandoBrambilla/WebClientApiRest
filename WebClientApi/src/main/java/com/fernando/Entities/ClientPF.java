package com.fernando.Entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;


@Entity 
@Table
public class ClientPF extends Client implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Column (nullable = false)
	private String cpf;
	
	@Column (nullable = false)
	@Temporal(TemporalType.DATE)
	private Date dateNasc;
	
	@Column (nullable = false)
	private String rg;
	
	@Column (nullable = false)
	private Date dateExp;
	
	@ManyToOne
	private Bank bank;
	
	//CONSTUCTOR
	public ClientPF(Integer id, String name, String phone, String email, String address, 
			String number, String complement, String city, String state, String cpf,
			Date dateNasc, String rg, Date dateExp, Bank bank) {
			super(id, name, phone, email, address, number, complement, city, state);
			this.cpf = cpf;
			this.dateNasc = dateNasc;
			this.rg = rg;
			this.dateExp = dateExp;
	}
	
	public ClientPF() {
			
	}
		
	//GETTERS AND SETTERS
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
		result = prime * result + Objects.hash(bank, cpf, dateExp, dateNasc, rg);
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
		ClientPF other = (ClientPF) obj;
		return Objects.equals(bank, other.bank) && Objects.equals(cpf, other.cpf)
				&& Objects.equals(dateExp, other.dateExp) && Objects.equals(dateNasc, other.dateNasc)
				&& Objects.equals(rg, other.rg);
	}

}