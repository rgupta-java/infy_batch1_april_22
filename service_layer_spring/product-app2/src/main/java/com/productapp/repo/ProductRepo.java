package com.productapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.productapp.entities.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Long>{
	//dao layer curd method ... :)
}
