package br.com.builderpattern;

public class BuilderPattern {

	public static void g(String[] args) {
		
		
		Carro carrao= new Carro.Builder("Blindado", 140).espelho("Refletivo").vidros("Fume").build();
		
		Carro carrao2= new Carro.Builder("Blindado", 140).vidros("Laranja").build();

		System.out.println(carrao);

		System.out.println(carrao2);
		

		System.out.println(carrao2);
		

		System.out.println(carrao2);
		
		
		
		Boolean.valueOf(null);

		
	}
	
	
	
	
}
