package exercicios.collections;

import java.util.HashSet;

public class HashMain {

	public static void main(String[] args) {

		HashSet<UserList> users = new HashSet<UserList>();
		
		users.add(new UserList("Mila"));
		users.add(new UserList("Márcia"));
		users.add(new UserList("Kamila"));
		
		boolean result = users.contains(new UserList("Kamila"));
		System.out.println(result);
		
		result = users.contains(new UserList("Kayla"));
		System.out.println(result);
	}
}
