package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "Contacts")
public class ContactEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank
	@Size(max = 60)
	private String firstName;
	
	@Size(max = 60)
	private String lastName;
	
	@Size(max = 12)
	private int phoneNumber;
	
	@Email
	@Size(max = 254)
	private String email;
	
	@Size(max = 254)
	private String address;
	
	@Size(max = 60)
	private String instrument;
	
	@Size(max = 60)
	private String birthday;
}
