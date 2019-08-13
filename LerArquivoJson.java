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
		string = string.replace("[","");
		string = string.replace("]","");
		String[] vet = string.split(",");
		int[] vetInt = new int[vet.length];
		
		for (int i = 0; i < vetInt.length; i++) {
			vetInt[i] = Integer.parseInt(vet[i]);
		}
		for (int i = 0; i < vetInt.length; i++) {
			System.out.print(vetInt[i]+ " ");
		}
		lido.close();
	}

}
