package hometask;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileWriter {
	private PrintWriter writer;
	private File newFile;
	private int composition;
	private int sum;
	
	public FileWriter(String outputFile, int composit, int summ) throws FileNotFoundException{
		newFile = new File(outputFile);
		writer = new PrintWriter(newFile);
		composition = composit;
		sum = summ;
	}

	public void write() {
		writer.write(String.valueOf(sum) + " ");
		writer.write(String.valueOf(composition));
		writer.flush();
		
		
		
	}

}
