package com.example.alugajogos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.alugajogos.model.Order;
import com.example.alugajogos.repository.OrderRepository;

/**
 * Define a lógica de serviço de um pedido.
 * 
 * 
 */

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository orderRepository;
	
	public void createOrder (Order order) {
		orderRepository.save(order);
	}

}
