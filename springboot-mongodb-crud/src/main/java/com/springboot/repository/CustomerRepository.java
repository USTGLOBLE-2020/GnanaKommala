package com.springboot.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.springboot.model.Customer;

public interface CustomerRepository extends MongoRepository<Customer, Long>{

}
