package com.fernando.Entities;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.MappedSuperclass;





@MappedSuperclass 
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Client implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	private Integer clientId;
	
	@Column (nullable = false)
	private String name;
	
	@Column (nullable = false)
	private String phone;
	
	@Column (nullable = false)
	private String email;
	
	@Column (nullable = false)
	private String address;
	
	private String number;
	private String complement;
	
	@Column (nullable = false)
	private String city;
	
	@Column (nullable = false)
	private String state;
	
	
	
	public Client(Integer id, String name, String phone, String email, String address, String number, String complement,
			String city, String state) {
		
		this.clientId = id;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.address = address;
		this.number = number;
		this.complement = complement;
		this.city = city;
		this.state = state;
		
	}

	public Client() {
		
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

	public Integer getClientId() {
		return clientId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, city, clientId, complement, email, name, number, phone, state);
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
		return Objects.equals(address, other.address) && Objects.equals(city, other.city)
				&& Objects.equals(clientId, other.clientId) && Objects.equals(complement, other.complement)
				&& Objects.equals(email, other.email) && Objects.equals(name, other.name)
				&& Objects.equals(number, other.number) && Objects.equals(phone, other.phone)
				&& Objects.equals(state, other.state);
	}

}