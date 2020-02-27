package exercicios.company.entities;

import exercicios.company.CalculaSalario;

public abstract class Employee implements CalculaSalario {
	
	private String nome;
	private Character sexo;
	private String email;
	private Integer age;
	private Double salario;
	private Double bonification;
	private Integer yearsWorking;
	private Enum<LevelEnum> level;
	
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
	
	public Employee(String nome, Character sexo, String email, Integer age, Double salario, Double bonification) {
		this.nome = nome;
		this.sexo = sexo;
		this.email = email;
		this.age = age;
		this.salario = salario;
		this.bonification = bonification;
	}

	public Employee(String nome, Character sexo, String email, Integer age, Double salario, Double bonification,
			Integer yearsWorking) {
		this.nome = nome;
		this.sexo = sexo;
		this.email = email;
		this.age = age;
		this.salario = salario;
		this.bonification = bonification;
		this.yearsWorking = yearsWorking;
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

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Integer getYearsWorking() {
		return yearsWorking;
	}

	public void setYearsWorking(Integer yearsWorking) {
		this.yearsWorking = yearsWorking;
	}

	public Enum<LevelEnum> getLevel() {
		return level;
	}

	public void setLevel(Enum<LevelEnum> level) {
		this.level = level;
	}
	
	public abstract String trabalhar();
	
	public Double calcular() {
		if (getLevel().equals(LevelEnum.JUNIOR)) this.salario = 3000.00;
		if (getLevel().equals(LevelEnum.PLENO)) this.salario = 5000.00;
		if (getLevel().equals(LevelEnum.SENIOR)) this.salario = 8000.00;
		return getSalario() + getBonification();
	}
}
