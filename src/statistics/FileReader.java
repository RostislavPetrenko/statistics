package statistics;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {
	private int arrayLength;
	private int [] array;
	
	public FileReader(String inputFile)throws FileNotFoundException {
		readFile(inputFile);
	}

	private void readFile(String inputFile) throws FileNotFoundException {
		Scanner scan = new Scanner(new File(inputFile));
		arrayLength = scan.nextInt();
		array = new int[arrayLength];
		
		int i = 0;
		while(scan.hasNext()){
			array[i++] = scan.nextInt();	
		}
		
		scan.close();
	}
	
	public int [] returnArray(){
		for (int j = 0; j < array.length; j++) {
			System.out.println(array[j]);
		}
		return array;
	}
	
}
