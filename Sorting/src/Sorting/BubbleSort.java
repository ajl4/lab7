package Sorting;
public class BubbleSort {
	/**
	 * bubbleSort				sorts an array of integers using bubble sort
	 * 
	 * @param unsortedArray		an unsorted array of integers
	 * @return					the input array, sorted least to greatest
	 */
	public static int[] bubbleSort(int[] unsortedArray) {
		//TODO: S1 implements bubble sort
	  int[] ret = (int[]) unsortedArray.clone();
		while (true) {
		  boolean hit = false;
		  for (int i = 0; i < ret.length - 1; i++) {
		    if (ret[i] > ret[i+1]) {
		      int temp = ret[i+1];
		      ret[i+1] = ret[i];
		      ret[i] = temp;
		      hit = true;
		    }
		  }
		  if (!hit) {
		    break;
		  }
		}
		return ret;
	}
}
