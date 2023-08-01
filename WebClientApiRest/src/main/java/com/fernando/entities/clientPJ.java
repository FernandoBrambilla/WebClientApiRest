package com.fernando.entities;

import java.util.Objects;

public class clientPJ extends client{
	
	
	private Integer cnpj;
	private Integer inscEst;
	
	public clientPJ(Integer id, String name, String phone, String email, String address, String number,
			String complement, String city, String state) {
		super(id, name, phone, email, address, number, complement, city, state);
	}

	public Integer getCnpj() {
		return cnpj;
	}

	public void setCnpj(Integer cnpj) {
		this.cnpj = cnpj;
	}

	public Integer getInscEst() {
		return inscEst;
	}

	public void setInscEst(Integer inscEst) {
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
		clientPJ other = (clientPJ) obj;
		return Objects.equals(cnpj, other.cnpj);
	}
	
	

}
