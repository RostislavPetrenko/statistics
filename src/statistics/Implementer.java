package statistics;

import java.io.FileNotFoundException;

public class Implementer {
	
	private final static String INPUT_FILE = "INPUT.TXT";
	private final static String OUTPUT_FILE = "OUTPUT.TXT";
	
	public static void main(String[] args) throws FileNotFoundException {
		FileReader reader = new FileReader(INPUT_FILE);
		Calculator calculator = new Calculator(reader.returnArray());
	
		FileWriter writer = new FileWriter(OUTPUT_FILE, calculator.getAnswer(), calculator.getOdd(), calculator.getEven());
		writer.writeIntoOutPutFile();
	}
}
