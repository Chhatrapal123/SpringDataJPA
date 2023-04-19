package com.cj.spring.data.springdatajpa;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.cj.spring.data.entities.Product;
import com.cj.spring.data.repos.ProductRepository;


@SpringBootTest
class SpringdatajpaApplicationTests {

	@Autowired
	ApplicationContext context;
	
	@Test
	public void saveProduct() 
	{
		ProductRepository repository = context.getBean(ProductRepository.class);
		Product product = new Product();
		product.setId(1L);
		product.setName("mac");
		product.setDescription("Awosome");
		product.setPrice(50000d);
		repository.save(product);	
		
		//System.out.println(repository.findByName("mac"));
	}
}
