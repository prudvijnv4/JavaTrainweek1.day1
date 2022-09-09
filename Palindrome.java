package javatraining.day1;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Pseudo Code
		
		 * a) Declare A String value as"madam"
		 
		 * b) Declare another String rev value as ""
		 * c) Iterate over the String in reverse order
		 * d) Add the char into rev
		 * e) Compare the original String with the reversed String, if it is same then print palinDrome 
		 
		 * Hint: Use .equals or .equalsIgnoreCase when you compare a String 
		 */
		
		String str ="madam";
		String rev = "";
		//char a = 'a';
		char[] charArray = str.toCharArray();
		int strlen = str.length();
		for (int i =strlen-1; i >= 0;i--) {
			rev = rev + charArray[i];
		//System.out.println(rev);
		}
		boolean righto = str.equals(rev);
		if (righto != true) {	
			System.out.println("Given string is not a pallindrome:"+ " "+ str);
			righto = true;
			} else {
		 	        System.out.println("Given string is a pallindrome :"+ " "+ str);
		}
		
			//if (str == rev) {
				//System.out.println("Given string is pallindrome:"+ " "+ str);
				//} else {
				//	System.out.println("Given string is not a pallindrome :"+ " "+ str);
				//}
		}


 }

