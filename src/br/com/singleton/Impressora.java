package br.com.singleton;



public class Impressora {

	
	public static final Impressora INSTANCE = new Impressora();
	
	
	private Impressora() {
		throw new AssertionError();
	}
	
	
	public static Impressora getInstance() {
		return INSTANCE;
	}
	
	public void imprimir(String mensagem) {
		System.out.println(mensagem);
	}
	
	
	public void gritar(String mensagem) {
		System.out.println(mensagem.toUpperCase());
	}
	
}
