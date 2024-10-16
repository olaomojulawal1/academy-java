package _Sorting28_algorithms;

import java.util.Arrays;

public class InsertionSort {
	static void insertionSort(int[] array) {
		  int size = array.length;
		  // outer loop for each index
		  for (int i = 1; i < size; i++) {
		   int key = array[i];
		   int j = i - 1;
		   // inner loop to compare and swap
		   while (j >= 0 && array[j] > key) {
		    array[j + 1] = array[j];
		    j = j - 1;
		   }
		   array[j + 1] = key;
		  }
		 }
	
	public static void main(String[] args) {
		  // Sample array to be sorted
		  int[] data = { 5, 3, -1, 7, 10, 2 };


		  // Print the array before sorting using Arrays.toString()
		  System.out.println("Before sort: " + Arrays.toString(data));
		  insertionSort(data);
		  System.out.println();
		  System.out.print("After sort " + Arrays.toString(data));


		  // Call bubbleSort method to sort the array
		  BubbleSort.bubbleSort(data);


		  // Print the array after sorting
		  System.out.println("After sort: " + Arrays.toString(data));
		 }
		}


	
	
