package exercicios.company;

import exercicios.company.entities.Employee;
import exercicios.company.entities.LevelEnum;
import exercicios.company.entities.Programmer;
import exercicios.company.entities.Tester;

public class HeritageApp {
	public static void main(String[] args) {
		
		Employee emp1 = new Programmer("Roger", 'M', "roger@gmail.com", 24, "Java");
		Employee emp2 = new Tester("Carla", 'F', "carla@gmail.com", 33, "JUnit");
		
		emp1.setYearsWorking(4);
		emp2.setYearsWorking(8);
		
		defineLevel(emp1);
		defineLevel(emp2);
		
		
	}
	
	private static void defineLevel(Employee emp) {

		if (emp.getYearsWorking() > 6) {
			emp.setLevel(LevelEnum.SENIOR);
		} else if(emp.getYearsWorking() > 3) {
			emp.setLevel(LevelEnum.PLENO);
		} else {
			emp.setLevel(LevelEnum.JUNIOR);
		}
		
		System.out.println(emp.getNome().toString() + " -- " + emp.getLevel().toString()
				+ "-- " +emp.trabalhar().toString());
	}
}
