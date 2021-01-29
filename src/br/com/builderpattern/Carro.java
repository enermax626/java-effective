package br.com.builderpattern;

public class Carro {

	private String vidros;
	private Integer potencia;
	private String pneu;
	private String espelho;

	private Integer adesivos;
	
	
	private Carro(Builder builder) {
		this.vidros = builder.vidros;
		this.potencia = builder.potencia;
		this.pneu=builder.pneu;
		this.espelho = builder.espelho;
	}
	
	
	
	public static class Builder{

		private String vidros;
		private Integer potencia;
		private String pneu = "michela";
		private String espelho = "simples";

		
		Builder(String pneu, Integer potencia){
			this.pneu = pneu;
			this.potencia = potencia;
		}
		
		public Builder vidros(String vidro) {
			this.vidros = vidro;
			return this;
		}
		
		public Builder espelho(String espelho) {
			this.espelho = espelho;
			return this;
		}

		
		public Carro build() {
			return new Carro(this);
			
		}	
		
	}
	@Override
	public String toString() {
		return "Builder [vidros=" + vidros + ", potencia=" + potencia + ", pneu=" + pneu + ", espelho=" + espelho
				+ "]";
	}
}
