package generics;

public class CaixaObjetoTeste {

	public static void main(String[] args) {
		CaixaObjeto caixaA = new CaixaObjeto();
		caixaA.aguardar(2.3);
		
		Double coisa = (Double) caixaA.abrir();
		System.out.println(coisa);
		
		CaixaObjeto caixaB = new CaixaObjeto();
		caixaB.aguardar("caixa A aguardando...");
		
		Double coisaB = (Double) caixaB.abrir();
		System.out.println(coisaB);
	

	}

}
