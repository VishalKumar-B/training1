package com.motivity;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Program2 {

	public static void main(String[] args) {
		int[] arr1 = { 8, 1, 2, 2, 3 };
		
		int l = arr1.length;
		
		int[] arr2 = Arrays.copyOf(arr1, l);
		Arrays.sort(arr2);
		
		
		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < l; i++) {
			boolean b = map.containsKey(arr2[i]);
			if (b == false)
				map.put(arr2[i], i);
		}

		int[] result = new int[l];
		for (int i = 0; i < l; i++) {
			result[i] = map.get(arr1[i]);
		}

		System.out.println(Arrays.toString(result));
	}
}
