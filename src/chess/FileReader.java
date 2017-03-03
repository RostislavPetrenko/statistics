package chess;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {
	private String answer;
	private String move;

	public FileReader(String fileName) throws FileNotFoundException {
		read(fileName);
		checkMoveValidity();
	}

	private void read(String fileName) throws FileNotFoundException {
		Scanner scan = new Scanner(new File(fileName));
		move = scan.next();
		scan.close();
	}

	private void checkMoveValidity() {
		int moveX = 0, moveXX = 0;
		
		if (move.length() != 5) {
			answer = "ERROR";
		}else {
		
		String[] letter = move.split("");
		String alphabet = "ABCDEFGH";
		String[] letters = alphabet.split("");

		System.out.println(letter[1]);
		int moveY = Integer.parseInt(letter[1]);
		int moveYY = Integer.parseInt(letter[4]);
		
		if(moveY > 8 || moveY < 1 && moveYY > 8 || moveYY < 1){
			answer ="ERROR";
		}
		
		for (int i = 0; i < letters.length; i++) {
			if (letter[0].equals(letters[i])) {
				moveX = i;
			}
			if (letter[3].equals(letters[i])) {
				moveXX = i;
			}
		}
		
		if(moveX - moveXX > 2 || moveX - moveXX < 2 && moveY - moveYY > 2 || moveY - moveYY < 2 ){
			answer="NO";
		}	else {
			answer = "YES";
		}
		}
	}

	public String getAnswer() {
		return answer;
	}
}
