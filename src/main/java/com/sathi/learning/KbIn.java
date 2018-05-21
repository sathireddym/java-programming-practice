package com.sathi.learning;

//Read a character from the keyboard.
class KbIn {
	public static void main(String args[]) throws java.io.IOException {
//		char ch;
//		System.out.print("Press a key followed by ENTER: ");
//		ch = (char) System.in.read(); // get a char
//		System.out.println("Your key is: " + ch);

		for (int i = 1; i <= 32; i = i + i) {
			System.out.print(i + " ");
			System.out.println();
		}

	}
}
