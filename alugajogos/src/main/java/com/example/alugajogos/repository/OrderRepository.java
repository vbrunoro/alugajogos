package com.example.alugajogos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.alugajogos.model.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
	
}