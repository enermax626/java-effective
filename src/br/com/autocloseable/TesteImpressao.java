package br.com.autocloseable;


public class TesteImpressao {

	public static void main(String[] args) {

		
		
		
		String arquivo = "D:\\testeImpressao.txt";
		String mensagem = "Teste de arquivoASDASDASD imprimido"+System.lineSeparator();
		
		ImpressoraArquivo.imprimirArquivo(arquivo, mensagem);
		
		

	}

}
