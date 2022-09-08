package javatraining.day1;

import java.io.CharArrayReader;

public class OddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Technology";
		
		int strLength = str.length();
		char[] charArray1 = str.toCharArray();
		//System.out.println(strLength);
		//boolean j = true;
		for (int i=0; i<=strLength-1; i++) {
			  //System.out.println(i);
				if(i%2 != 0) {
					char a = charArray1[i];
					char upperCase =Character.toUpperCase(a);
					System.out.println( upperCase);
					}
				else {
					  char a = charArray1[i];
					  char lowerCase =Character.toLowerCase(a);
					  System.out.println( lowerCase);
					}
				}
		}

}
