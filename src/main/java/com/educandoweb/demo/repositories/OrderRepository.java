package com.educandoweb.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.demo.entitities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
