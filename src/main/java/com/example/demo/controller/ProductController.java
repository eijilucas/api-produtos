package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Produto;
import com.example.demo.repository.ProductRepository;

@RestController
@RequestMapping("/produtos")
public class ProductController {

	@Autowired
	private ProductRepository productRepository ;
	
	@GetMapping
	public List<Produto> listar() {
		return productRepository.findAll();
	}
	
	@PostMapping
	public Produto adicionar(@RequestBody Produto prod) {
		return productRepository.save(prod);
	}
}
