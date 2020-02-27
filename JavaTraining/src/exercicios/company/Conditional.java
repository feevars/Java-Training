package exercicios.company;

public class Conditional {
	public static void main(String[] args) {
		
		Employee emp1 = new Employee("Roger", 'M', "roger@gmail.com", 24);
		Employee emp2 = new Employee("Carla", 'F', "carla@gmail.com", 33);
		
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
