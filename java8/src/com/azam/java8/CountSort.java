package com.azam.java8;

public class CountSort {// order O(n) 
	public static void main(String[] args) {
		int[] arr = { 4,1,5,2,2,3 };
		int[] arr2 = new int[100];
		for (int i : arr) {
			arr2[i]++;
		}
		for(int i=0; i<arr2.length; i++) {
			if (arr2[i]!=0) {
				for(int j=0; j<arr2[i];j++) {
					System.out.println(i);
				}
			}
		}
	}
}
