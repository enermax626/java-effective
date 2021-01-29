package br.com.singleton;

public class testando {

	public static void main(String[] args) {
		
		
		Impressora imp = Impressora.getInstance();
		
		
		imp.imprimir("Teste impressao");
		
		imp.gritar("alo alo lusiano");
		
		
		
	}
	
	
	
	
}
