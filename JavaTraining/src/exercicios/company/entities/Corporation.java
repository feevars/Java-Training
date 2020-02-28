package exercicios.company.entities;

import java.util.ArrayList;
import java.util.List;

import exercicios.company.Countries;

public class Corporation {

	
	private String name;
	private Integer serial;
	
	List<Employee> employees = new ArrayList<>();
	List<Countries> countries = new ArrayList<>();
	
	public Corporation(String name) {
		this.name = name;
	}
	
	public Corporation(String name, Integer serial) {
		super();
		this.name = name;
		this.serial = serial;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Integer getSerial() {
		return serial;
	}

	public List<Employee> getEmployees() {
		return employees;
	}


	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}


	public List<Countries> getCountries() {
		return countries;
	}


	public void setCountries(List<Countries> countries) {
		this.countries = countries;
	}

	@Override
	public String toString() {
		return "Corporation name: " + name + "\n";
	}
	
	
}
