package javatraining.day1;

import java.util.Arrays;

public class FindDups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {82, 39, -21, 82, 80,-21, 45, 56};
		int lengthNums = nums.length;
		Arrays.sort(nums);
		System.out.println("Duplicate elements in the given array:");
		for (int i = 0 ; i<nums.length; i++) {
			//System.out.println(nums[i]);
			for(int j = i+1; j<nums.length; j++) {
				if (nums[i] == nums [j]) {		
					System.out.println(nums [j]);
				}
				
				
				}			
	}
		
   }
}