package com.fernando.entities;

import java.util.Objects;

import com.fernando.enums.bankType;

public class bank {
	
	private Integer id;
	private String name;
	private bankType bankType;
	private String ag;
	private String account;
	
	public bank(Integer id, String name, com.fernando.enums.bankType bankType, String ag, String account) {
		super();
		this.id = id;
		this.name = name;
		this.bankType = bankType;
		this.ag = ag;
		this.account = account;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public bankType getBankType() {
		return bankType;
	}

	public void setBankType(bankType bankType) {
		this.bankType = bankType;
	}

	public String getAg() {
		return ag;
	}

	public void setAg(String ag) {
		this.ag = ag;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		bank other = (bank) obj;
		return Objects.equals(id, other.id);
	}	
	
	
	
	

}
