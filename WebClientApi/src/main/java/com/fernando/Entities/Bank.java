package com.fernando.Entities;

import java.util.Objects;

import com.fernando.Enums.AccountBankType;

public class Bank {

	private Integer id;
	private String name;
	private AccountBankType accountBankType;
	private String ag;
	private String account;

	public Bank(Integer id, String name, com.fernando.Enums.AccountBankType accountBankType, String ag,
			String account) {
		super();
		this.id = id;
		this.name = name;
		this.accountBankType = accountBankType;
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

	public AccountBankType getAccountBankType() {
		return accountBankType;
	}

	public void setAccountBankType(AccountBankType accountBankType) {
		this.accountBankType = accountBankType;
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
		Bank other = (Bank) obj;
		return Objects.equals(id, other.id);
	}
}
