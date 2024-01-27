package com.azam.unite_testing;

/**
 * Hello world!
 *
 */
public class App {
	public static int main(int a, int b) {
		if (a<0) {
			throw new IllegalArgumentException();
		}
		return a + b;
	}
}
