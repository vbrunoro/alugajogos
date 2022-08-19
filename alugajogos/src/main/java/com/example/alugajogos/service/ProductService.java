package com.example.alugajogos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.alugajogos.model.Product;
import com.example.alugajogos.repository.ProductRepository;

/**
 * Define a lógica de serviço de um produto.
 * 
 * 
 */

@Service
public class ProductService {
	
	@Autowired
	ProductRepository productRepository;
	
	public List<Product> getAllProduct(){
		return productRepository.findAll();
	}
	
	public void addProduct(Product product) {
		productRepository.save(product);
	}
	public void removeProductById(Long id) {
		productRepository.deleteById(id);
	}
	
	public Optional<Product> getProductById(long id){
		return productRepository.findById((long) id);
	}
	
	public List<Product> getAllProductsByCategoryId(int id){
		
		return productRepository.findAllByCategory_Id(id);
	}

}