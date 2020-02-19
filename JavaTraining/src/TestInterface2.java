


public interface TestInterface2 {
	
	default void show() {
		System.out.println("TestInterface2 - Substring(4, 8) = ".concat("TestInterface2".substring(4, 8)));
	}
}
