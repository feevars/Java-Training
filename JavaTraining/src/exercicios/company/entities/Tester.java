package exercicios.company.entities;

public class Tester extends Employee {

	private String tool;
	private Integer HorasTestando;
	
	public Tester(String nome, Character sexo, String email, Integer age) {
		super(nome, sexo, email, age);
	}
	
	public Tester(String nome, Character sexo, String email, Integer age, String tool) {
		super(nome, sexo, email, age);
		this.setTool(tool);
	}
	
	public Tester(String nome, Character sexo, String email, String tool) {
		super(nome, sexo, email);
		this.setTool(tool);
	}

	public String getTool() {
		return tool;
	}

	public void setTool(String tool) {
		this.tool = tool;
	}

	public Integer getHorasTestando() {
		return HorasTestando;
	}

	public void setHorasTestando(Integer HorasTestando) {
		this.HorasTestando = HorasTestando;
	}

	@Override
	public String trabalhar() {
		setHorasTestando(70);
		return getHorasTestando().toString()+" horas";
	}

	@Override
	public void fazerHorasExtra() {
		// TODO Auto-generated method stub
		
	}

}
