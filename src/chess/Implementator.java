package chess;

import java.io.FileNotFoundException;

public class Implementator {
	
	final static String INPUT_FILE = "INPUT3.TXT";
	final static String OUTPUT_FILE = "OUTPUT3.TXT";
	
	
	public static void main(String[] args) throws FileNotFoundException {
		FileReader reader = new FileReader(INPUT_FILE);
		FileWriter writer = new FileWriter(OUTPUT_FILE, reader.getAnswer());
		writer.write();
	}

}
