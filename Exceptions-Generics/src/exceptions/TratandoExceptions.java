package exceptions;

public class TratandoExceptions {

	public static void main(String[] args)  {
		
		try {
			geraErro1();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
		/*
		 * Se não quer tratar na classe, tem que usar o try catch em cada uma das exceções
		 * 
		 */
		try {
			geraErro2();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		try {
			geraErro3();
		} catch (Throwable e) {
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("O fim");
	}
	
	//exceção não checada
	static void geraErro1() {
		throw new RuntimeException("Ocorreu um erro #1");
	}
	
	
	static void geraErro2() {
			throw new RuntimeException("Ocorreu outro erro #2");
	}
	
	//exceção checada
	static void geraErro3() throws Exception {
		throw new Exception("Opa! agora o erro #3");
	}

}
