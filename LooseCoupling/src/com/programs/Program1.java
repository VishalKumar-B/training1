package com.programs;

class Program1 {

	public static void main(String[] args) {
		int num = 100;
		int count = 1;
		int i = num + 1;
		while (num > 0) {
			if (i < 10) {
				System.out.println(i++);
				count++;
			} else if (i >= 10) {
				String s = Integer.toString(i);
				char a = s.charAt(s.length() - 2);
				char b = s.charAt(s.length() - 1);
				if (a <= b) {
					System.out.println(s);

				}
				i++;
				count++;
			}
			if (count >= 100)
				break;
		}
	}

}
