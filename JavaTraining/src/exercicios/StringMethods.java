package exercicios;

public class StringMethods {
	public static void main(String[] args) {

		String s = new String("Boa tarde, X");

		s = s.replace("X", "senhora");
		s = s.toUpperCase();
		System.out.println(s);

		s = s.concat("!");

		System.out.println(s);
	}
}
