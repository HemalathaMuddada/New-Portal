package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "users_user")
@Getter
@Setter
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @Column(name = "user_name")
    private String email; 
    
    @Column(name = "password")
    private String pwd;
    
    @Column(name = "role")
    private String role;

	public String getEmail() {
		return email;
	}

	public String getPwd() {
		return pwd;
	}

	public String getRole() {
		return role;
	}
}
