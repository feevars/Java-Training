package exercicios.company;

public class StringMethods {
	public static void main(String[] args) {

		
		Employee emp1 = new Employee("Roger", 'M', "roger@gmail.com");
		Employee emp2 = new Employee("Carla", 'F', "carla@gmail.com");

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
}
