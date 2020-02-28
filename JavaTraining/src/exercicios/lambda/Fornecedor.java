package exercicios.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {
	public static void main(String[] args) {	
		Supplier<List<String>> list = 
				() -> Arrays.asList("Ana","Carlos","Maria","José","Guilherme","Matheus");	
		System.out.println(list.get());
	}
}
