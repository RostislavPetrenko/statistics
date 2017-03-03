package statistics;

import java.io.FileNotFoundException;

public class Implementer {
	
	final static String INPUT_FILE = "INPUT.TXT";
	final static String OUTPUT_FILE = "OUTPUT.TXT";
	
	public static void main(String[] args) throws FileNotFoundException {
		FileReader reader = new FileReader(INPUT_FILE);
		Calculator calculator = new Calculator(reader.returnArray());
	
		FileWriter writer = new FileWriter(OUTPUT_FILE, calculator.getAnswer(), calculator.getOdd(), calculator.getEven());
		writer.writeIntoOutPutFile();
	}
}
