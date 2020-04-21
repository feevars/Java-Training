package designpatterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {

	private Map<String, Item> items = new HashMap<String, Item>();

	public Registry() {
		loadItems();
	}
	
	public Item createItem (String type) {
		Item item = null;
		
		try {
			item = (Item)(items.get(type)).clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return item;
	}

	private void loadItems() {
		Movie movie = new Movie();
		movie.setTitle("Gato Miu");
		movie.setPrice(3.60);
		movie.setRuntime("30 minutos");
		items.put("Movie", movie);
		
		Book book = new Book();
		book.setTitle("O Conto");
		book.setNumberOfPages(20);
		book.setPrice(2.00);
		items.put("Book", book);
		
	}
	
	
}
