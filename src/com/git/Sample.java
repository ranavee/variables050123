package com.git;

public class Sample {

	public static void main(String[] args) {
		String s = "Git Trail";
		String output = "";
		String[] split = s.split(" ");

		for (String a : split) {
			String rev = "";

			for (int i = a.length() - 1; i >= 0; i--) {
				rev = rev + a.charAt(i);
			}

			System.out.println("b1 branch push");
			System.out.print(output = rev + " ");
		}
	}

}
