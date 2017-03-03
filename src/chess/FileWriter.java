package chess;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileWriter {
	private String answer;
	private PrintWriter writer;
	private File newFile;
	
	public FileWriter(String fileName, String answer) throws FileNotFoundException{
		this.answer = answer;
		newFile = new File(fileName);
		writer = new PrintWriter(newFile);
	}
	
	public void write() {
		writer.write(answer);
		writer.flush();
	}
}
