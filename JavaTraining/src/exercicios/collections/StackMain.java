package exercicios.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackMain {
	public static void main(String[] args) {
		Deque<String> books = new ArrayDeque<String>();
		
		books.add("Rapunzel");
		books.push("O segredo");
		books.push("A volta dos que não foram");
		books.add("A última torre");
		
		System.out.println(books.peek());
		System.out.println(books.element());
		
//		System.out.println(books.poll());
//		System.out.println(books.poll());
//		System.out.println(books.poll());
		//System.out.println(books.remove()); exception
		//System.out.println(books.pop()); exception
		
		for(String book: books) {
			System.out.println(book);
		}
	}
}
