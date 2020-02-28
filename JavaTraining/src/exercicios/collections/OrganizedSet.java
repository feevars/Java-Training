package exercicios.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class OrganizedSet {
	public static void main(String[] args) {
		
		Set<String> employees = new HashSet<>(); //HashSet<> ou HashSet<String>
		
		
		employees.add("Mariana");
		employees.add("Carlos");
		employees.add("Giovana");
		employees.add("Miriam");
		employees.add("Bruno");
		
		for (String employee: employees) {
			System.out.println(employee);
		}
		
		SortedSet<Integer> fruits = new TreeSet<>();
		
		fruits.add(40);
		fruits.add(10);
		fruits.add(9);
		fruits.add(4);
		
		for(int f: fruits) {
			System.out.println(f);
		}
	}
}
