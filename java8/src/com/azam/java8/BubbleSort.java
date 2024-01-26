package com.azam.java8;

public class BubbleSort {
	public static void main(String[] args) {
		int[] a = {4,1,5,3,2};
		for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
		for(int i = 0; i < a.length-1; i++) {
			for(int j = 0; j < a.length-i-1; j++) {
				if(a[j] > a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
			}
		}
		System.out.println();
		for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
	}
}
