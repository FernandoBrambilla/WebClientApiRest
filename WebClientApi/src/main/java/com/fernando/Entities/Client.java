package com.fernando.Entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;




@MappedSuperclass 
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Client implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	private Integer clientId;
	private String name;
	private String phone;
	private String email;
	private String address;
	private String number;
	private String complement;
	private String city;
	private String state;
	@ManyToOne
	private Bank bank;
	
	public Client(Integer id, String name, String phone, String email, String address, String number, String complement,
			String city, String state, Bank bank) {
		
		this.clientId = id;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.address = address;
		this.number = number;
		this.complement = complement;
		this.city = city;
		this.state = state;
		this.bank = bank;
	}

	public Integer getId() {
		return clientId;
	}

	public void setId(Integer id) {
		this.clientId = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getComplement() {
		return complement;
	}

	public void setComplement(String complement) {
		this.complement = complement;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public int hashCode() {
		return Objects.hash(clientId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Client other = (Client) obj;
		return Objects.equals(clientId, other.clientId);
	}
	
	


}