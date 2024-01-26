package com.azam.java8;

import java.util.HashMap;
import java.util.Map;

public class CharFreqUseArray {
	public static void main(String[] args) {
		String str = "ahasansankar";
		int[] freq = new int[256];
		for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }
		for (int i = 0; i < freq.length; i++) { 
			if (freq[i] > 0)
			System.out.println((char)i + " : " + freq[i]);
		}
	}
}
