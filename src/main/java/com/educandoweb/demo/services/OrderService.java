package com.educandoweb.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.demo.entitities.Order;
import com.educandoweb.demo.repositories.OrderRepository;

@Service //para o spring reconhecer como um componente para poder resalizar a auto injeção
public class OrderService {
	
	@Autowired
	private OrderRepository OrderRepository;
	
	public List<Order> findAll(){
		return OrderRepository.findAll();
		
	}
	public Order findById(Long id) {
		Optional<Order> obj = OrderRepository.findById(id);
		return obj.get();
	}
}
