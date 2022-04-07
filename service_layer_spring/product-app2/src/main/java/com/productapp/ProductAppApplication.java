package com.productapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.productapp.entities.Product;
import com.productapp.service.ProductService;
import com.productapp.service.ProductServiceImpl;

@SpringBootApplication
public class ProductAppApplication implements CommandLineRunner {

	@Autowired
	private ProductService productService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProductAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		productService.addProduct(new Product("laptop", 100000.00));
		productService.addProduct(new Product("TV", 40000.00));
		System.out.println("product is added to db...");
		
	}

}
