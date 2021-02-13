package com.programs;

public class MyCode {

	public static String replaceWithAsterisk(String password) {
		
		int vowels=0;
		String rePassword = "";
		for(int i=0;i<=password.length()-1;i++) {
			char ch = password.charAt(i);
			
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == '*') {
		        ++vowels;
		      }
		}
		
		for(int j = 1 ; j<=vowels; j++) {
			rePassword += "*";
		}
	    return rePassword;
	  }

	  public static void main (String[] args) {

	    System.out.println(replaceWithAsterisk(""));

	    System.out.println(replaceWithAsterisk("hello"));

	    System.out.println(replaceWithAsterisk("To*day!"));

	  }
}
