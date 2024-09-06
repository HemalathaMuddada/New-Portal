package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>,JpaSpecificationExecutor<Customer> {
	
	@Query("SELECT DISTINCT user FROM Customer user " 
//	+ "INNER JOIN FETCH user.authorities AS authorities "
			+ "WHERE lower(user.email) = lower(:email)")
	Optional<Customer> findByEmail(String email);
}