package exercicios.banco.entities;

public class CaixaEletronico {

	public Conta conta;
	
	public Conta autentica(String numeroConta, String senha) {
		if (conta.getNumero().equals(numeroConta) && conta.getSenha().equals(senha)) {
			System.out.println("Validação concluída");
			return conta;
		} else {
			System.out.println("falhou");
			return conta;
		}
	}
}
