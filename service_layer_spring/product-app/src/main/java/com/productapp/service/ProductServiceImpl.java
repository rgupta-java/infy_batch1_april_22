package com.productapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productapp.entities.Product;
import com.productapp.exceptions.ProductNotFoundException;
import com.productapp.repo.ProductRepo;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepo productRepo;

	@Override
	public List<Product> findAll() {
		return productRepo.findAll();
	}

	@Override
	public Product getById(Long id) {
		//there is a concept called optional in java
		Product product = productRepo.findById(id)
				.orElseThrow(() -> 
				new ProductNotFoundException("product with id " + id + " is not found"));
		
		return product;
	}

	@Override
	public Product addProduct(Product product) {
		productRepo.save(product);
		return product;
	}

}
