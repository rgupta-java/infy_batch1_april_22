package com.productapp.service;
import java.util.*;

import com.productapp.entities.Product;
public interface ProductService {
	public List<Product>findAll();
	public Product getById(Long id);
	public Product addProduct(Product product);
}
