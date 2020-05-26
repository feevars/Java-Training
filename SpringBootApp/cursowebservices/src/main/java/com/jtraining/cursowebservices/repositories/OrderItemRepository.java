package com.jtraining.cursowebservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jtraining.cursowebservices.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
