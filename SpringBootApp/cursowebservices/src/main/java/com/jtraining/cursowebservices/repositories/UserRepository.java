package com.jtraining.cursowebservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jtraining.cursowebservices.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
