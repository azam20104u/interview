package com.azam.java8;

public class CatchFinallyDemo {

	public static void main(String[] args) {
		int a = m();
		System.out.println(a);
	}

	static int m() {
		try {
			int res = 10 / 0;
		} catch (Exception e) {
			System.out.println("catch");
			return 10;
		} finally {
			System.out.println("finally");
			return 20;
		}
	}
}
