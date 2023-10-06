package com.fernando.Security;

import java.io.Serializable;
import java.util.Objects;

public class AccontCredential implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String userName;
	private String password;
	
	//CONSTRUCTOR
	public AccontCredential(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
		
	public AccontCredential() {

	}

	//GETTERS AND SETTERS
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	//HASHCODE AND EQUALS
	@Override
	public int hashCode() {
		return Objects.hash(password, userName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AccontCredential other = (AccontCredential) obj;
		return Objects.equals(password, other.password) && Objects.equals(userName, other.userName);
	}
}
