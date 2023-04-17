package com.example.Entity;

import org.hibernate.validator.constraints.UniqueElements;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
public class Validation {

	@Id
	@Column(unique = true)
	@NotEmpty(message="Id should not empty")
	String id;

	@NotEmpty(message="Name should not empty")
	@Size(min=4,max=10,message="size of name must be min 4 and max 5")
	String name;
     
	@NotEmpty(message="SurName should not empty")
	String surname;
    
	@NotEmpty(message="MobileNo should not empty")
	@Pattern(regexp ="^\\d{10}$",message="MobileNo should be 10 digits")
	String mobileno;

	@NotEmpty(message="Address should not empty")
	String address;

	public Validation(String id, String name, String surname, String mobileno, String address) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.mobileno = mobileno;
		this.address = address;
	}

	public Validation() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
