package hometask;

import java.io.FileNotFoundException;

public class Implementator {
	
	private final static  String INPUT_FILE = "INPUT2.TXT";
	private final static String OUTPUT_FILE = "OUTPUT2.TXT";
	
	public static void main(String[] args) throws FileNotFoundException {
		
		FileReader reader = new FileReader(INPUT_FILE);
		Calculator calculator = new Calculator(reader.returnArray());
		FileWriter writer = new FileWriter(OUTPUT_FILE, calculator.getComposition(),calculator.getSumPositiveNum());
		writer.write();
		
	
	}
}
