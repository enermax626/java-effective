package br.com.builderpattern;

public class BuilderPattern {

	public static void g(String[] args) {
		
		
		Carro carrao= new Carro.Builder("Blindado", 140).espelho("Refletivo").vidros("Fume").build();
		
		Carro carrao2= new Carro.Builder("Blindado", 140).vidros("Laranja").build();
		
		Carro carrao3= new Carro.Builder("Blindado", 140).vidros("Laranja").build();

		
		Carro carrao4= new Carro.Builder("Blindado", 140).vidros("Vermelho").build();
		
		Carro carrao5= new Carro.Builder("Blindado", 140).vidros("Azul").build();
		
		System.out.println(carrao);

		System.out.println(carrao5);
		
		System.out.println(carrao4);

		System.out.println(carrao3);
		
		System.out.println(carrao2);
		
		Boolean.valueOf(null);

		
	}
	
	
	
	
}
