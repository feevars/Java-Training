package exercicios.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
	public static void main(String[] args) {
		
		Consumer<Product> printName = p -> System.out.println(p.nome + "!");
		
		Product p1 = new Product("Caneta", 12.34, 0.09);
		printName.accept(p1);
		
		Product p2 = new Product("Notebook", 1243.44, 0.09);
		Product p3 = new Product("Caderno", 23.34, 0.1);
		Product p4 = new Product("Borracha", 3.50, 0.23);
		Product p5 = new Product("Lápis", 1.20, 0.06);
		
		
		List<Product> products = Arrays.asList(p1, p2, p3, p4, p5);
		
		products.forEach(printName);
		products.forEach(p -> System.out.println(p.preco));
		products.forEach(System.out::println);
	}
}
