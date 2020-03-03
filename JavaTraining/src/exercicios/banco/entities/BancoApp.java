package exercicios.banco.entities;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.Scanner;

public class BancoApp {
	
	public static String menu() {
		String menuOpcoes = "Bem vindo ao Caixa 24hrs! \nDigite a opção desejada: \n"
				+"1)Saque\n2)Deposito\n3)Extrato";
		return menuOpcoes;
	}
	

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		final Scanner sc = new Scanner(System.in);
		
		final Conta conta = new Conta();
		conta.setNumero("1425");
		conta.setSenha("1234");
		
		
		//Date inicio = Date.from(Date.parse("2020-01-20"));
		
		System.out.println(menu());
		
		switch(sc.nextInt()) {
		case 1:
			System.out.println("Digite o valor que deseja sacar: ");
			Double valor = sc.nextDouble();
			conta.efetuarSaque(valor);
		case 2:
			System.out.println("Digite o valor que deseja depositar: ");
			valor = sc.nextDouble();
			conta.efetuarDeposito(valor);
		case 3:
			System.out.println("Extrato:");
			//conta.extrato(inicio, new Date());
		default:
			System.out.println("Opção inválida");
			menu();
			sc.nextInt();
		}
		
	}
}
