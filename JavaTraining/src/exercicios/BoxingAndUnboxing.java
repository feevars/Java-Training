package exercicios;

public class BoxingAndUnboxing {

	public static void main(String[] args) {
		int x = 20;
		
		Object obj = x;

		System.out.println(obj);
		
		int y = (int) obj;
		
		System.out.println(y);
		
		String car = "answer";
		String num = "42";
		
		
		System.out.println(car.concat(num));
		
		
	}

}
