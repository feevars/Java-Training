package exercicios.company;

public class Tester extends Employee {

	private String tool;
	
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
}
