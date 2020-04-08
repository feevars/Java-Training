package com.jtraining.cursowebservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jtraining.cursowebservices.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
