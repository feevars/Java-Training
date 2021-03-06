package exercicios.company.entities;

public class Programmer extends Employee {

	private String linguagem;
	private Integer horasProgramando;
	
	public Programmer() {
		super();
	}

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

	public Programmer(String nome, Character sexo, String email, Integer age, Double salario, Double bonification) {
		super(nome, sexo, email, age, salario, bonification);
	}

	public String getLinguagem() {
		return linguagem;
	}

	public void setLinguagem(String linguagem) {
		this.linguagem = linguagem;
	}
	
	public Integer getHorasProgramando() {
		return horasProgramando;
	}

	public void setHorasProgramando(Integer horasProgramando) {
		this.horasProgramando = horasProgramando;
	}

	public String trabalhar() {
		System.out.println("testando");
		setHorasProgramando(60);
		return getHorasProgramando().toString() +" horas";
	}
	
	public static boolean isAdult(int age)
	{
		System.out.println("entrou");
		
		return true;
	}

	@Override
	public void fazerHorasExtra() {
		// TODO Auto-generated method stub
		
	}

}
