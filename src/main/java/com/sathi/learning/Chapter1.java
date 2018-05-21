package com.sathi.learning;

public class Chapter1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("My Weight on mooon is: " + 0.17 * 62 + "\n");
		for (int i = 1; i < 145; i++) {
			System.out.println(i + " Inches = " + i / 39.37 + "Meters");
			if (i % 12 == 0 & i > 1) {
				System.out.println("\n");
			}
		}
	}

}
