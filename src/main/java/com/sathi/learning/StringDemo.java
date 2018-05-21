package com.sathi.learning;

//Introduce String.
class StringDemo {
	public static void main(String args[]) {
		// declare strings in various ways
		String str1 = new String("Java strings are objects.");
		String str2 = "They are constructed various ways.";
		String str3 = new String(str2);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);

		int y, x=1;
		y = x < 0 ? 10 : 20;
		System.out.println("Y="+y);
		changeString (str1);
		System.out.println("After calling change String str1 = " + str1);
	}
	
	private static void changeString (String str){
		str= "String value after calling changeString";
	}
}