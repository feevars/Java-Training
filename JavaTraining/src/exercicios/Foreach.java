package exercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import exercicios.company.StringMethodsApp;
import exercicios.company.entities.Department;
import exercicios.company.entities.Employee;
import exercicios.company.entities.Programmer;

public class Foreach {

	public static void main(String[] args) {

		List<String> alunos = Arrays.asList("Ana", "Bob", "Joe", "Mat", "Jenifer", "Bruno");
		
		System.out.println("Forma tradicional: ");
		for(String nome: alunos) {
			System.out.println(nome);
		}
		
		System.out.println("\nLambda: ");
		alunos.forEach((nome) -> System.out.println(nome));

		System.out.println("\nReferência de método: ");
		alunos.forEach(System.out::println);
		
		System.out.println("\nLambda 2:");
		alunos.forEach(nome -> printWelcome(nome));
		
		System.out.println("\nReferência de método 2: ");
		alunos.forEach(Foreach::printWelcome);
		
		Programmer programmer = new Programmer();
		programmer.setAge(20);
		ArrayList<Programmer> list = new ArrayList();
		list.add(programmer);
		
		
		System.out.println("\nReferência de método 2: ");
		list.forEach(p -> System.out.println(p.getAge()));
		list.forEach(Programmer::trabalhar);
		
		list.stream().map(p->p.getAge()).anyMatch(Programmer::isAdult);
		
	}
	
	static void printWelcome(String nome) {
		if (nome == "Ana") {
			System.out.println("Bem-vinda ao curso, " +nome +"!");
		} else {
			System.out.println("Bem-vindo ao curso, " +nome +"!");
		}
	}

}
