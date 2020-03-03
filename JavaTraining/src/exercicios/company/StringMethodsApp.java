package exercicios.company;

import exercicios.company.entities.Employee;
import exercicios.company.entities.Programmer;
import exercicios.company.entities.Tester;

public class StringMethodsApp {
	public static void main(String[] args) {

		Employee emp1 = new Programmer("Roger", 'M', "roger@gmail.com", "Java");
		Employee emp2 = new Tester("Carla", 'F', "carla@gmail.com", "JUnit");

		String s = new String("Boa tarde, X");

		sexoEmployee(emp1, s);
		sexoEmployee(emp2, s);
	}

	public static void sexoEmployee(Employee emp, String s) {
		if (emp.getSexo().equals('F')) {
			s = s.replace("X", "senhora");
		} else {
			s = s.replace("X", "senhor");
		}
		s = s.concat("!");
		System.out.println(s);
	}
	
	public void teste(String nome) {
		System.out.println("funcionou");
	}
}
