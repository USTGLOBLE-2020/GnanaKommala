package com.springboot.model;

import java.util.UUID;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "CustomerDB")
public class Customer {

	@Id
	private String id;
	@NotEmpty(message = "Customer name must not be empty")
    @Size(min = 4, message = "Name should have atleast 4 characters")
	private String name;
	@NotEmpty(message = "Type of Customer name must not be empty")
    @Size(min = 4, message = "Type of Customer should have atleast 4 characters")
	private String type;
	
	private String email;
	
	private String password;

	public Customer() {
		this.id = UUID.randomUUID().toString();
	}

	public Customer(String id, String name, String type, String email, String password) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.email = email;
		this.password = password;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
