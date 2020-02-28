package exercicios.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapMain {

	public static void main(String[] args) {

		Map<Integer, String> users = new HashMap<>();
		
		users.put(1, "Mauro");
		users.put(2, "Rebecca");
		users.put(3, "Cláudia");
		users.put(4, "Vanessa");
		users.put(5, "Josy");

		System.out.println(users.size());
		System.out.println(users.isEmpty());
		System.out.println(users.keySet());
		System.out.println(users.values());
		System.out.println(users.entrySet());
		
		System.out.println(users.containsKey(10));
		System.out.println(users.containsValue("Josy"));
		
		for (int key: users.keySet()) {
			System.out.println(key);
		}
		
		for (String value : users.values()) {
			System.out.println(value);
		}

		for(Entry<Integer, String> registro: users.entrySet()) {
			System.out.print(registro.getKey()+ " ==> ");
			System.out.println(registro.getValue());
		}
	}

}
