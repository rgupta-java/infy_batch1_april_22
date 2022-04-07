package com.productapp.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.productapp.entities.Product;
import com.productapp.service.ProductService;
@RequestMapping(path = "api/v1/")
@RestController//@RestController= @Controller+@ResponseBody(it convert ur return value to json using a parser)
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@GetMapping(path = "products")
	public List<Product> getAll(){
		return productService.findAll();
	}
	
	//http://localhost:8090/api/v1/products/2
	
	@GetMapping(path = "products/{id}")
	public Product getOneProduct(@PathVariable(name = "id")Long id){
		return productService.getById(id);
	}
	
	
	@PostMapping(path = "products")
	public Product addOneProduct(@RequestBody Product product){
		return productService.addProduct(product);
	}
	
	
}


