package javatraining.day1;

public class Prime {

	public static void main(String[] args) {
		    int n = 9;
		    int count = 0;
			  for(int i=2; i <= n-1; i++)  {
				  if(n % i == 0) {
				    //System.out.println(n  + "is  not a prime number" );    
				    count++;
				       		} 
			  }
				  if (count == 0) {
				       			System.out.println(n +  "is a prime number");
				       			} else {
				       				System.out.println(n + "is not a prime number");
				       			}
		  }
   }




