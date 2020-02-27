package exercicios.company.entities;

public class Programmer extends Employee {

	private String linguagem;

	public Programmer(String nome, Character sexo, String email) {
		super(nome, sexo, email);
	}
	
	public Programmer(String nome, Character sexo, String email, Integer age, String linguagem) {
		super(nome, sexo, email, age);
		this.setLinguagem(linguagem);
	}
	
	public Programmer(String nome, Character sexo, String email, String linguagem) {
		super(nome, sexo, email);
		this.setLinguagem(linguagem);
	}

	public String getLinguagem() {
		return linguagem;
	}

	public void setLinguagem(String linguagem) {
		this.linguagem = linguagem;
	}

}
