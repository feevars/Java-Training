import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import entities.Product;

public class CollectionConcepts {
 public static void main(String[] args) {
	Product door = new Product("Porta de madeira", 120.00);
	Product floorPanel = new Product("Piso de taco", 40.00);
	Product window = new Product("Janela de aço", 60.00);
	
	Collection<Product> products = new ArrayList<>();
	products.add(door);
	products.add(floorPanel);
	products.add(window);
	
	Collection<Product> otherProducts = new ArrayList<>();
	otherProducts.add(door);
	otherProducts.add(floorPanel);
	otherProducts.add(window);
	
	System.out.println(products.size());
	System.out.println(products.isEmpty());
	System.out.println(products.contains(window));
	
	
	final Iterator<Product> productIterator = products.iterator();
	while (productIterator.hasNext()) {
		Product product = productIterator.next();
		if (product.getValue() > 60) {
			System.out.println(product);
		} else {
			productIterator.remove();
		}
	}
	
	for (Product product : products) {
		System.out.println(product);
	}
	
	System.out.println(products.size());
	System.out.println(products.isEmpty());
	System.out.println(products.contains(window));
	products.removeAll(products);
}
}
