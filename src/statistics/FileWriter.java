package statistics;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileWriter {
	private PrintWriter writer;
	private File newFile;
	private String oddDays;
	private String evenDays;
	private String answer;
	
	public FileWriter(String outPutFile,String theAnswer, String odd, String even ) throws FileNotFoundException{
		newFile = new File(outPutFile);
		writer = new PrintWriter(newFile);
		oddDays = odd;
		evenDays = even;
		answer = theAnswer;
	}
	
	public void writeIntoOutPutFile(){
	writer.write(oddDays);
	writer.write("\n");
	writer.write(evenDays);
	writer.write("\n");
	writer.write(answer);
	writer.flush();
	}

}
