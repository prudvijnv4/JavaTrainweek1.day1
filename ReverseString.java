package javatraining.day1;

import java.util.Arrays;

public class ReverseString {
	public static void main(String[] args) {
		
		String str = "hello";
		int length = str.length();
		char[] CharArray1 = str.toCharArray();
		for (int i = length-1; i >=0; i--) {
			System.out.println(CharArray1[i]);
		}
		
	
}
	
}
