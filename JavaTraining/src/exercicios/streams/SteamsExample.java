package exercicios.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class SteamsExample {
	public static void main(String[] args) {
		
		
		//Consumer<Object> print = System.out::print;
		Consumer<String> print = System.out::print;
		Consumer<Integer> println = System.out::println;
		
		
		Stream<String> langs = Stream.of("Java ", "Cobol ", "TypeScript ", "Ruby\n");
		langs.forEach(print);
		
		String[] moreLangs = {"Python ", "Lisp ", "Perl ", "Go ", "C\n"};
		Stream.of(moreLangs).forEach(print);
		Arrays.stream(moreLangs).forEach(print);
		Arrays.stream(moreLangs, 1, 4).forEach(print);
		
		List<String> otherLangs = Arrays.asList("C# ", "PHP ", "Kotlin\n");
		otherLangs.stream().forEach(print);
		otherLangs.parallelStream().forEach(print);
		
		//Stream.generate(() -> "a").forEach(print);
		Stream.iterate(0, n -> n+1).forEach(println);;
	
	}
}
