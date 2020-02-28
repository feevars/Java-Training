package exercicios.collections;

import java.util.ArrayList;

public class ExampleList {

	public static void main(String[] args) {
		ArrayList<UserList> users = new ArrayList<>();
		
		UserList u1 = new UserList("Ana");
		users.add(u1);
		
		users.add(new UserList("Carlos"));
		users.add(new UserList("Beatriz"));
		users.add(new UserList("Marcos"));
		users.add(new UserList("Eva"));
		users.add(new UserList("Jesus"));
		
		System.out.println(users.get(3));
		
		for (UserList u: users) {
			System.out.println(u.getNome());
		}
		
		for (UserList u: users) {
			System.out.println(u.toString());
		}
		
		System.out.println(users.remove(4));
		
		//System.out.println(users.remove("Jesus"));
		
	}
}
