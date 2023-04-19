package com.cj.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cj.spring.data.entities.Product;
import com.cj.spring.data.repos.ProductRepository;

@RestController
@RequestMapping("/products")
public class ProductController 
{
	@Autowired
	ProductRepository repository;
	
	@GetMapping
	public Iterable<Product>getProducts()
	{
		return repository.findAll();		
	}

}
