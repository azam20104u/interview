package com.azam.array;

public class CounterSort {
	public static void main(String[] args) {
		int[] a = { 5, 2, 7, 9, 1, 3, 4, 0, 8, 6 };
		int[] b = new int[1000];

		for (int i : a) {
			b[i]++;
		}
		for (int i = 0; i < b.length; i++) {
			if (b[i] != 0) {
				for (int j = 0; j < b[i]; j++) {
					System.out.print(i + " ");
				}
			}
		}
	}
}
