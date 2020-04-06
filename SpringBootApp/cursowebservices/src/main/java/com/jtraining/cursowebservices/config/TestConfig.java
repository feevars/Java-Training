package com.jtraining.cursowebservices.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.jtraining.cursowebservices.entities.User;
import com.jtraining.cursowebservices.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Jorge", "jorge@gmail.com", "123231231", "131313");
		User u2 = new User(null, "Carla", "carla@gmail.com", "127867861", "1354313");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		
	}
	
}
