package com.jtraining.cursowebservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jtraining.cursowebservices.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
