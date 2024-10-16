package _04Week_Monday_Challenge;


import java.util.Arrays;
public class Main {
	public void Start() {
		
		
		int[] arr = { 10, 20, 30, 50, 60, 80, 110, 130, 140, 170 };
		Arrays.sort(arr);
		int x = 110;
		int result = binarySearch(arr, x);
		if (result == -1) {
			System.out.println("Element x not present in the array.");
		} else {
			System.out.println("Element x found at index " + result);
		}
		x = 175;
		result = binarySearch(arr, x);
		if (result == -1) {
			System.out.println("Element x not present in the array.");
		} else {
			System.out.println("Element x found at index " + result);
		}
	}
	int binarySearch(int[] arr, int x) {
		// put your code here.
		int low = 0;
		int high = arr.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == x) {
				return mid;
			}
			if (arr[mid] < x) {
				low = mid + 1;
			}
			if (arr[mid] > x) {
				high = mid - 1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		Main main = new Main();
		main.Start();
	}
}