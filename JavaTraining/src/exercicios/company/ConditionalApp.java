package exercicios.company;

import exercicios.company.entities.Employee;
import exercicios.company.entities.LevelEnum;
import exercicios.company.entities.Programmer;
import exercicios.company.entities.Tester;

public class ConditionalApp {
	public static void main(String[] args) {
		
		Employee emp1 = new Programmer("Roger", 'M', "roger@gmail.com", 24, "Java");
		Employee emp2 = new Tester("Carla", 'F', "carla@gmail.com", 33, "JUnit");
		
		checkBonification(emp1);
		checkBonification(emp2);
		
		emp1.setYearsWorking(4);
		emp2.setYearsWorking(8);
		
		defineLevel(emp1);
		defineLevel(emp2);
		
		emp1.calcularSalario();
		emp2.calcularSalario();
		
		System.out.println(emp1.getNome().concat(" --- ") + emp1.getSalario().toString());
		System.out.println(emp2.getNome().concat(" --- ") + emp2.getSalario().toString());
		
	}

	private static void checkBonification(Employee emp) {
		
		if (emp.getAge()>30) {
			emp.setBonification(300.00);
		} else {
			emp.setBonification(200.00);
		}
		System.out.println(emp.getNome().toString() + " -- " + emp.getBonification().toString());
	}
	
	private static void defineLevel(Employee emp) {

		if (emp.getYearsWorking() > 6) {
			emp.setLevel(LevelEnum.SENIOR);
		} else if(emp.getYearsWorking() > 3) {
			emp.setLevel(LevelEnum.PLENO);
		} else {
			emp.setLevel(LevelEnum.JUNIOR);
		}
		
		System.out.println(emp.getNome().toString().concat(" -- ") + emp.getLevel().toString().concat(" -- ")
				+emp.trabalhar().toString());
	}
	
}
