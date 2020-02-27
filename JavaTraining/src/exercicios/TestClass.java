package exercicios;


public class TestClass implements TestInterface1, TestInterface2 {

	public void show() {
		TestInterface1.super.show();
		TestInterface2.super.show();
	}
	
	public static void main(String[] args) {
		
		String charac = new String("Pauta");
		System.out.println(TestInterface1.compare(charac));
		
		TestClass t = new TestClass();
		t.show();
		
	}

}
