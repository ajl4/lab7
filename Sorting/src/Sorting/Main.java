package Sorting;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Generates a randomd array
		int[] unsortedArray = new int[(int) (Math.random()*20.0)];
		for (int i = 0; i < unsortedArray.length; i++) {
			unsortedArray[i] = (int) (Math.random()*20.0);
		}
		
		System.out.println("Unsorted Array:");
		
		for (int i: unsortedArray) {
				System.out.print(i + " ");
		}
		System.out.println();
		
		System.out.println("Sorted Array:");
		int[] sortedArray = InsertionSort.insertionSort(unsortedArray);
		for (int i: sortedArray) {
      System.out.print(i + " ");
		}
	}

}
