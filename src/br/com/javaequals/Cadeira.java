package br.com.javaequals;

public class Cadeira {

	private String tipo;
	private double valor;
	public Cadeira(String tipo, double valor) {
		super();
		this.tipo = tipo;
		this.valor = valor;
	}
	
	@Override
	public boolean equals(Object o) {
		if(!(o instanceof Cadeira))
			return Boolean.FALSE;
		else 
			return (this.tipo.equals(((Cadeira) o).getTipo()) && this.valor ==((Cadeira) o).getValor());
	}

	public String getTipo() {
		return tipo;
	}

	public double getValor() {
		return valor;
	}

	
	
	
}
