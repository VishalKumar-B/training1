package com.motivity;

public class Program4 {

	public static void main(String[] args) {
		int[] nums = { 0, 1 };
		int result = 0;
		
		for (int i = 1; i <= nums.length; i++) {
			result = result + i - nums[i - 1];
		}
		System.out.println(result);
	}

}
