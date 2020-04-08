package com.jtraining.cursowebservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jtraining.cursowebservices.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
