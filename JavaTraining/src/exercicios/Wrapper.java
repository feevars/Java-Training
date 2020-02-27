package exercicios;

public class Wrapper {
	public static void main(String[] args) {
		
		
		int num = 10;
		Integer num2 = num;
		
		String palavra = num2.toString();
		System.out.println(palavra);
		
		double var = 2.45;
		Double var2 = var;
		
		//palavra = var; double cannot convert to String
		palavra = var2.toString();
		System.out.println(palavra);
		
		float flo = 1.45F;
		Float flo2 = flo;
		
		System.out.println(flo2);
	}
}
