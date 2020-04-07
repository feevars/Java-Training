package com.jtraining.cursowebservices.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.jtraining.cursowebservices.entities.Order;
import com.jtraining.cursowebservices.entities.User;
import com.jtraining.cursowebservices.repositories.OrderRepository;
import com.jtraining.cursowebservices.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Jorge", "jorge@gmail.com", "123231231", "131313");
		User u2 = new User(null, "Carla", "carla@gmail.com", "127867861", "1354313");
		
		Order o1 = new Order(null, Instant.parse("2020-04-11T20:03:02Z"), u1);
		Order o2 = new Order(null, Instant.parse("2020-03-11T20:23:02Z"), u2);
		Order o3 = new Order(null, Instant.parse("2020-04-01T14:03:02Z"), u1);
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
		
	}
	
}
