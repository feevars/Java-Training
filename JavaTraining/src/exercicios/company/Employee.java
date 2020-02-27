package exercicios.company;

public class Employee {
	
	private String nome;
	private Character sexo;
	private String email;
	private Integer age;
	private Double bonification;
	
	public Employee(String nome, Character sexo, String email) {
		this.nome = nome;
		this.sexo = sexo;
		this.email = email;
	}
	
	public Employee(String nome, Character sexo, String email, Integer age) {
		this.nome = nome;
		this.sexo = sexo;
		this.email = email;
		this.age = age;
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

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Double getBonification() {
		return bonification;
	}

	public void setBonification(Double bonification) {
		this.bonification = bonification;
	}
	
	
}
