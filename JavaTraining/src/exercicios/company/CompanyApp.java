package exercicios.company;

import java.util.ArrayList;
import java.util.List;

import exercicios.company.entities.Corporation;

public class CompanyApp {
	public static void main(String[] args) {
		
		List<Corporation> corps = new ArrayList<>();
		
		corps.add(new Corporation("Avid"));
		corps.add(new Corporation("Lambda"));
		corps.add(new Corporation("Virso"));
		
		System.out.println(corps);
	}
}
