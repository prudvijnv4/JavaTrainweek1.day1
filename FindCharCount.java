package javatraining.day1;

public class FindCharCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "cognizant";
		char k = 'n';
		int Count = 0;
		int length = str.length();
		char[] charArray = str.toCharArray();
			for (int i=0; i<= length-1; i++) {
				if (charArray[i] == k) {
				Count++;
			}
		}
		System.out.println("Count is : " + Count);
	}

}
