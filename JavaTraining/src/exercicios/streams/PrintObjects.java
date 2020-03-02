package exercicios.streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class PrintObjects {
	public static void main(String[] args) {
		List<String> aprovados = Arrays.asList("Mari", "Jorge", "Cássio", "Mariana");
		
		for (String nome : aprovados) {
			System.out.println(nome);
		}
		
		System.out.println("\nUsando iterator...");
		Iterator<String> it = aprovados.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("\nUsando stream...");
		Stream<String> str = aprovados.stream();
		str.forEach(System.out::println); //laço interno
	}
}
