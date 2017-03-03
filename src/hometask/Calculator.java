package hometask;

public class Calculator {
	private int[] array;
	private int max;
	private int min;
	private int j;//index of max
	private int k;//index of min

	public Calculator(int[] array) {
		this.array = array;
		findMax();
		findMinimun();
	}

	private int findMinimun() {
		min = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
				k = i;
			}
		}
		return min;
	}

	private int findMax() {
		max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
				j=i;
			}
		}
		return max;
	}

	public int getComposition() {
		int number = 1;
		if(j>k){
		for (int i = 0; i < array.length; i++) {
			if (array[i] > min && array[i] < max && i>k && i<j) {
				number *= array[i];
			}
		}
		} else {
			for (int i = array.length-1; i > 0; i--) {
				if (array[i] > min && array[i] < max && i<k && i>j) {
					number *= array[i];
				}	
			}
		}
		return number;
	}

	public int getSumPositiveNum(){
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] >= 0) {
				sum += array[i];
			}
		}
		return sum;
	}
}