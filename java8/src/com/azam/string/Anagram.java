package com.azam.string;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String s1 = "peek";
		String s2 = "keep";
		if (s1.length() != s2.length()) {
			System.out.println("not a anagram");
		} else {
			char[] arr1 = s1.toCharArray();
			char[] arr2 = s2.toCharArray();
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			if (Arrays.equals(arr1, arr2)) {
				System.out.println("anagram");
			} else {
				System.out.println("not anagram");
			}
		}
	}
}
