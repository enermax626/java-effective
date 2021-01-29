package br.com.javaequals;


public class JavaEquals {

	
	
	public static void main(String[] args) {
		
		
		Cadeira c = new Cadeira("madeira",2.0);
		Cadeira c2 = new Cadeira("Ferro",3.0);
		Cadeira c3 = new Cadeira("madeira",2.0);
		
		if(c.equals(c3))
			System.out.println("São iguais");
		else
			System.out.println("Diferentes");
		
		if(c.equals(null))
			System.out.println("São iguais");
		else
			System.out.println("Diferentes");
		
		
	}
	
	
}
