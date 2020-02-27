package exercicios.company;

import exercicios.company.entities.Employee;
import exercicios.company.entities.Programmer;
import exercicios.company.entities.Tester;

public class ConditionalApp {
	public static void main(String[] args) {
		
		Employee emp1 = new Programmer("Roger", 'M', "roger@gmail.com", 24, "Java");
		Employee emp2 = new Tester("Carla", 'F', "carla@gmail.com", 33, "JUnit");
		
		checkBonification(emp1);
		checkBonification(emp2);
	}

	private static void checkBonification(Employee emp) {
		
		if (emp.getAge()>30) {
			emp.setBonification(300.00);
		} else {
			emp.setBonification(200.00);
		}
		System.out.println(emp.getNome().toString() + " -- " + emp.getBonification().toString());
	}
}
