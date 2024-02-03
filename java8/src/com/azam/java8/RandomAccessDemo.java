package com.azam.java8;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class RandomAccessDemo {
	public static void main(String[] args) {
		List<Integer> list = new LinkedList<Integer>();
		for (int i = 0; i < 1000000; i++) {
			list.add(i);
		}
		long start = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			System.out.println(list.get(new Random().nextInt(100000)));
		}
		long end = System.nanoTime();
		System.out.println("Toatl time taken: " + (end - start));// with ArrayList 35527380
																	// with LinkedList 2149020536
	}
}
