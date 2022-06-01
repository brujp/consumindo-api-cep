package br.com.bruno.cep;

import java.io.BufferedReader;
import java.io.IOException;

public class Util {
	
	public static String converteJsonEmString(BufferedReader bufferedReader) throws IOException {
		
		String resposta = "";
		String jsonEmString = "";
		
		while((resposta = bufferedReader.readLine()) != null) {
			jsonEmString += resposta;
		}
		
		return jsonEmString;
	}

}
