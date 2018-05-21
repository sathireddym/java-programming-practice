package com.sathi.learning;

class Backwards {
	String str;

	Backwards(String s) {
		str = s;
	}

	void backward(int indx) {
		if (indx != str.length() - 1)
			backward(indx + 1);
			System.out.print(str.charAt(indx));		
	}

//	 void backward(int idx) {
//	 if (idx != str.length() - 1)
//	 backward(idx + 1);
//	 System.out.print(str.charAt(idx));
//	 }
}

class RecursiveBackwardsDemo {
	public static void main(String args[]) {
		Backwards s = new Backwards("This is a test");
		s.backward(0);
	}
}