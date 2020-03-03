package exercicios.collections;

import java.util.HashSet;
import java.util.Set;

public class UnnorganizedSet {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		//HashSet não aceita repetição	
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2);
		conjunto.add(true);
		conjunto.add("Teste");
		conjunto.add(1);
		conjunto.add('X');
		
		System.out.println("Tamanho do conjunto é: " + conjunto.size());
		
		conjunto.add("teeste");
		conjunto.add("Teste");
		
		System.out.println("Tamanho do conjunto é: " + conjunto.size());
		
		//verifica se o elemento existe n conjunto
		System.out.println(conjunto.contains(true));
		System.out.println(conjunto.remove("Teste"));
		
		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		//intersecção
		System.out.println(conjunto.retainAll(nums));
		System.out.println(conjunto);
	}
}
