package com.springboot.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.model.Customer;
import com.springboot.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	/*
	 * @GetMapping("/products") public ResponseEntity<List<Product>>
	 * getAllProduct(){ return
	 * ResponseEntity.ok().body(productService.getAllProduct()); }
	 * 
	 * @GetMapping("/products/{id}") public ResponseEntity<Product>
	 * getProductById(@PathVariable long id){ return
	 * ResponseEntity.ok().body(productService.getProductById(id)); }
	 */

	@PostMapping("/customers")
	public ResponseEntity<Customer> createProduct(@Valid @RequestBody Customer customer) {
		return ResponseEntity.ok().body(this.customerService.createCustomer(customer));
	}

	/*
	 * @PutMapping("/products/{id}") public ResponseEntity<Product>
	 * updateProduct(@PathVariable long id, @RequestBody Product product){
	 * product.setId(id); return
	 * ResponseEntity.ok().body(this.productService.updateProduct(product)); }
	 */

	/*
	 * @DeleteMapping("/products/{id}") public HttpStatus
	 * deleteProduct(@PathVariable long id){ this.productService.deleteProduct(id);
	 * return HttpStatus.OK; }
	 */
}
