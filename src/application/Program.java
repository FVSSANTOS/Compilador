package application;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Program {

	public static void main(String[] args) {

		String path = "C:\\Users\\lucas\\Desktop\\testes\\Compilador\\DigiteOPrograma.txt";

		try {
            String conteudoStr = new String(Files.readAllBytes(Paths.get(path)));
            Analyzer analyzer = new Analyzer(conteudoStr.toCharArray());
            analyzer.printTokens();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
	}

}