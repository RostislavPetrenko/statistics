package statistics;

public class Calculator {
	private int[] array;
	private String answer;
	private String odd;
	private String even;
	private int oddNumCounter = 0;
	private int evenNumCounter = 0;

	public Calculator(int[] array) {
		this.array = array;
		gettingEvenOddnums();
		gettingAnswer();
	}

	private void gettingEvenOddnums() {
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				even = even + " " + array[i];
				evenNumCounter++;
			} else {
				odd = odd + " " + array[i];
				oddNumCounter++;
			}
		}
	}

	private String gettingAnswer() {
		if (evenNumCounter > oddNumCounter) {
			answer = "YES";
		} else if (evenNumCounter == oddNumCounter) {
			answer = "Neither";
		} else {
			answer = "NO";
		}
		return answer;
	}

	public String getAnswer() {
		return answer;
	}

	public String getOdd() {
		return odd;
	}

	public String getEven() {
		return even;
	}

}
