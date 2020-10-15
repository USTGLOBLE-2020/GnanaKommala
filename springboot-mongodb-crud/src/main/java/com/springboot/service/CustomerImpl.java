package com.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.model.Customer;
import com.springboot.repository.CustomerRepository;

@Service
@Transactional
public class CustomerImpl implements CustomerService{

	
	@Autowired
	private CustomerRepository customerRepository;
	
	
	@Override
	public Customer createCustomer(Customer Customer) {
		return customerRepository.save(Customer);
	}

	/*
	 * @Override public Product updateProduct(Product product) { Optional<Product>
	 * productDb = this.productRepository.findById(product.getId());
	 * 
	 * if(productDb.isPresent()) { Product productUpdate = productDb.get();
	 * productUpdate.setId(product.getId());
	 * productUpdate.setName(product.getName());
	 * productUpdate.setDescription(product.getDescription());
	 * productRepository.save(productUpdate); return productUpdate; }else { throw
	 * new ResourceNotFoundException("Record not found with id : " +
	 * product.getId()); } }
	 * 
	 * @Override public List<Product> getAllProduct() { return
	 * this.productRepository.findAll(); }
	 * 
	 * @Override public Product getProductById(long productId) {
	 * 
	 * Optional<Product> productDb = this.productRepository.findById(productId);
	 * 
	 * if(productDb.isPresent()) { return productDb.get(); }else { throw new
	 * ResourceNotFoundException("Record not found with id : " + productId); } }
	 * 
	 * @Override public void deleteProduct(long productId) { Optional<Product>
	 * productDb = this.productRepository.findById(productId);
	 * 
	 * if(productDb.isPresent()) { this.productRepository.delete(productDb.get());
	 * }else { throw new ResourceNotFoundException("Record not found with id : " +
	 * productId); }
	 * 
	 * }
	 */

	
}
