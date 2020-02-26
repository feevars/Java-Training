
public class TestCasting {

	public static void main(String[] args) {
		
		double a = 1;
		System.out.println(a);

		float b = 1.0F;
		float c = (float) a;
		float d = (float) 1.0;

		int e = 4;
		//byte d = e;
		byte by = (byte) e;
		System.out.println(d);

		double f = 1;
		int g = (int) f;
		System.out.println(g);

		int j = 10;
		Integer k = j;
		String h = k.toString();
		
		int numero = 300;
		System.out.println(Integer.toString(numero));
		

	}

}
