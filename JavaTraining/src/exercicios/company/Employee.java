package exercicios.company;

public class Employee {
	
	private String nome;
	private Character sexo;
	private String email;
	
	public Employee( ) {
		
	}
	
	public Employee(String nome, Character sexo, String email) {
		super();
		this.nome = nome;
		this.sexo = sexo;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Character getSexo() {
		return sexo;
	}

	public void setSexo(Character sexo) {
		this.sexo = sexo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
