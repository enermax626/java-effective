package br.com.autocloseable;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ImpressoraArquivo implements AutoCloseable{

	
	
	public static void imprimirArquivo(String arquivo, String mensagem) {
		
		try {
			
		File f = new File(arquivo);
			
		FileWriter fw = new FileWriter(f);
		
		fw.write(mensagem);
		fw.append(mensagem);
		fw.close();
		} catch (IOException e) {
			System.out.println("Arquivo não encontrado");
		}
		
		
	}

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
}
