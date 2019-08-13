package vetorEmatriz;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LerArquivoJson {
	

	public static void main(String[] args) throws IOException {
	
		String string;
		FileReader arq = new FileReader("arrayjson.json");
		BufferedReader lido = new BufferedReader(arq);
		string = lido.readLine();
		
		System.out.println(string);
		lido.close();
	}

}
