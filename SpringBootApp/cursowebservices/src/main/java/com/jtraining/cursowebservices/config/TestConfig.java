package com.jtraining.cursowebservices.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.jtraining.cursowebservices.entities.Category;
import com.jtraining.cursowebservices.entities.Order;
import com.jtraining.cursowebservices.entities.OrderItem;
import com.jtraining.cursowebservices.entities.Product;
import com.jtraining.cursowebservices.entities.User;
import com.jtraining.cursowebservices.entities.enums.OrderStatus;
import com.jtraining.cursowebservices.repositories.CategoryRepository;
import com.jtraining.cursowebservices.repositories.OrderItemRepository;
import com.jtraining.cursowebservices.repositories.OrderRepository;
import com.jtraining.cursowebservices.repositories.ProductRepository;
import com.jtraining.cursowebservices.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private OrderItemRepository orderItemRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Category cat1_electronics = new Category(null, "Electronics");
		Category cat2_books = new Category(null, "Books");
		Category cat3_computers = new Category(null, "Computers");
		
		Product p1_gatomiu = new Product(null, "Gato Miu", "miau miau miau miau!", 5.0, "");
		Product p2_pccarroca = new Product(null, "PC Carroça", "Aquele do seu tio que você sempre tem que consertar", 100.0, "");
		Product p3_notebookgamer = new Product(null, "Notebook Gamer", "Alta performance, para você que passa o dia inteiro olhando para a tela", 1500.0, "");
		Product p4_celulartijolao = new Product(null, "Celular Tijolão", "HOT RELEASE Nokia!!!", 20.0, "");
		Product p5_avoltadosquenaoforam = new Product(null, "A volta dos que não foram", "Uma aventura de tirar o fôlego!", 26.40, "");
		
		categoryRepository.saveAll(Arrays.asList(cat1_electronics, cat2_books, cat3_computers));
		productRepository.saveAll(Arrays.asList(p1_gatomiu, p2_pccarroca, p3_notebookgamer, p4_celulartijolao, p5_avoltadosquenaoforam));
		
		p1_gatomiu.getCategories().add(cat2_books);
		p2_pccarroca.getCategories().add(cat1_electronics);
		p2_pccarroca.getCategories().add(cat3_computers);
		p3_notebookgamer.getCategories().add(cat1_electronics);
		p3_notebookgamer.getCategories().add(cat3_computers);
		p4_celulartijolao.getCategories().add(cat1_electronics);
		p5_avoltadosquenaoforam.getCategories().add(cat2_books);
		
		productRepository.saveAll(Arrays.asList(p1_gatomiu, p2_pccarroca, p3_notebookgamer, p4_celulartijolao, p5_avoltadosquenaoforam));
		
		User u1 = new User(null, "Jorge", "jorge@gmail.com", "123231231", "131313");
		User u2 = new User(null, "Carla", "carla@gmail.com", "127867861", "1354313");
		
		Order o1 = new Order(null, Instant.parse("2020-04-11T20:03:02Z"), OrderStatus.WAITING_PAYMENT, u1);
		Order o2 = new Order(null, Instant.parse("2020-03-11T20:23:02Z"), OrderStatus.SHIPPED , u2);
		Order o3 = new Order(null, Instant.parse("2020-04-01T14:03:02Z"), OrderStatus.DELIVERED ,u1);
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
		
		OrderItem oi1 = new OrderItem(o1, p2_pccarroca, 3, p2_pccarroca.getPrice());
		OrderItem oi2 = new OrderItem(o1, p3_notebookgamer, 1, p3_notebookgamer.getPrice());
		OrderItem oi3 = new OrderItem(o2, p1_gatomiu, 5, p1_gatomiu.getPrice());
		OrderItem oi4 = new OrderItem(o3, p4_celulartijolao, 2, p4_celulartijolao.getPrice());
		
		orderItemRepository.saveAll(Arrays.asList(oi1, oi2, oi3, oi4));
	}
	
}
