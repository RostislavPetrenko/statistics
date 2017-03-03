package statistics;

public class ArrayOfIntegers {
	
	private int[] array;
	private int arrayLength;
	
	public ArrayOfIntegers(int length){
		arrayLength = length;
		array = new int[arrayLength];	
	}
	
	public void fillArray(int [] array){
		this.array = array;
	}
}
