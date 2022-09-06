package javatraining.day1;

import java.util.Arrays;

public class FindMinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {39, -21, 82, 80, 45, 56};
		int length = nums.length;
		Arrays.sort(nums);
		for (int i = 0; i<=nums.length-1; i++) {
			System.out.println(nums[i]);
			//System.out.println(nums[length -1] + "Max value");
				}
		System.out.println(nums[0] + " "+ "Min value" );
		System.out.println(nums[length -1] + "Max value");
	}
}
		
		
