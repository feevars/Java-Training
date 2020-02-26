
public interface TestInterface1 {

	default void show() {
		System.out.println("TestInterface1 - Substring(3, 9) = ".concat("TestInterface1".substring(3, 9)));
	}
	static boolean compare(String str) {
		return (str.compareToIgnoreCase("caracteres") < 0);
	}
}
