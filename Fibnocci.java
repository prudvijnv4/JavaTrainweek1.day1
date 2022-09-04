package javatraining.day1;

public class Fibnocci {

	public static void main(String[] args) {
		
		int x = 0;
		int y = 1;
		int z = 0;
		
		System.out.println(x);
		
		for (int i = 1; i<=11; i++) {
			
			
			System.out.println(y);
			z = x + y;
			x = y;
			y = z;

	}
		
	}
}