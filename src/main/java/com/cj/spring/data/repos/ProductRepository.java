package com.cj.spring.data.repos;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.cj.spring.data.entities.Product;
import java.lang.String;


public interface ProductRepository extends CrudRepository<Product, Long> 
{
	List<Product> findByName(String name);
}
