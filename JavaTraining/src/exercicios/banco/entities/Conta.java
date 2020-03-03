package exercicios.banco.entities;

import java.util.Date;
import java.util.List;

public class Conta {

	private Double saldo;
	private String numero;
	private String senha;
	
	private Transacao t;
	
	Conta() {}
	
	public Conta(Double saldo, String numero, String senha, List<Transacao> historico) {
		this.saldo = saldo;
		this.numero = numero;
		this.senha = senha;
		this.historico = historico;
	}

	private List<Transacao> historico;

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public List<Transacao> getHistorico() {
		return historico;
	}

	public void setHistorico(List<Transacao> historico) {
		this.historico = historico;
	}
	
	public Boolean efetuarSaque(Double valor) {
		if (this.getSaldo() > valor) {
			this.setSaldo(this.getSaldo()-valor);
			return true;
		} else {
			System.out.println("saldo insuficiente");
			return false;
		}
		
	}
	
	public Boolean efetuarDeposito(Double valor) {
		this.setSaldo(this.getSaldo()+valor);
		return true;
	}
	
	public Boolean efetuarPagamento(String boleto, Double valor) {
		
		if (valor < getSaldo()) {
			t.setDescricao(boleto);
			t.setData(new Date());
			t.setValor(valor);
			System.out.println("Succeed");
			return historico.add(t);
		} return false;
	}
	
	@SuppressWarnings("null")
	public List<Transacao> extrato (Date inicio, Date fim) {
		//data inicio e fim are missing
		List<Transacao> printExtrato = null;
		for (Transacao transac : historico) {
			printExtrato.add(transac);
		}
		return printExtrato;
	}
}
