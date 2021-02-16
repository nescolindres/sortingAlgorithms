package sortingAlgorithms;

import java.util.Arrays;
import java.util.Random;

public class Sorting {

	public void quickSort(int[] A) {
		quickSort(A,0,A.length-1);
	}
	
	private void quickSort(int[] A, int low, int high) {
		if(low< high+1) {
			int p = partition(A, low, high);
			quickSort(A, low , p-1);
			quickSort(A, p+1, high);
		}
	}
	private void swap(int[] A, int index1, int index2) {
		int temp = A[index1];
		A[index1] = A[index2];
		A[index2] = temp;
	}
	// returns random pivot index between low and high inclusive 
	private int getPivot(int low, int high) {
		Random rand = new Random();
		return rand.nextInt((high-low) + 1) + low;
		
		// we can also get a better pivot by comparing the left, right, and middle elements and getting the median of those three.
	}
	privae int medianOfThree () {
		int privot;
		
	return pivot;	
	}
	
	
	// moves all n< pivot to left pivot and all n> pivot
	//to right of pivot, then returns pivot index.
	private int partition(int[] A, int low, int high) {
		swap(A, low, getPivot(low, high));
		int border = low + 1;
		for (int i = border; i <= high; i++) {
			if(A[i] < A[low]) {
				swap(A, i , border++);
			}
		}
		swap(A, low, border - 1);
		return border-1;
	}

	
	public static void main(String[] args) {
		Sorting sort = new Sorting();
		int[] A = {21,31,6,33,75,34,1,8,34,76,88,99,12};
		System.out.println(Arrays.toString(A));
		sort.quickSort(A);
		System.out.println(Arrays.toString(A));
	}
	
	
}
