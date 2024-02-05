package com.azam.array;

public class BinarySearch {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int search = 3;
		int low = 0;
		int high = arr.length - 1;
		boolean found = false;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (arr[mid] == search) {
				System.out.println("found at index: " + mid);
				found = true;
				break;
			} else if (arr[mid] < search) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		if (!found) {
			System.out.println("Not found");
		}
	}
}
