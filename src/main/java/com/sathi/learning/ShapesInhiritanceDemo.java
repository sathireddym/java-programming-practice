package com.sathi.learning;

//Add more constructors to TwoDShape.
class TwoDShape1 {
	private double width;
	private double height;

	// A default constructor.
	TwoDShape1() {
		width = height = 0.0;
	}

	// Parameterized constructor.
	TwoDShape1(double w, double h) {
		width = w;
		height = h;
	}

	// Construct object with equal width and height.
	TwoDShape1(double x) {
		width = height = x;
	}

	// Accessor methods for width and height.
	double getWidth() {
		return width;
	}

	double getHeight() {
		return height;
	}

	void setWidth(double w) {
		width = w;
	}

	void setHeight(double h) {
		height = h;
	}

	void showDim() {
		System.out.println("Width and height are " + width + " and " + height);
	}
}

// A subclass of TwoDShape for triangles.
class Triangle1 extends TwoDShape1 {
	private String style;

	// A default constructor.
	Triangle1() {
		super();
		style = "none";
	}

	// Constructor
	Triangle1(String s, double w, double h) {
		super(w, h); // call superclass constructor
		style = s;
	}

	// One argument constructor.
	Triangle1(double x) {
		super(x); // call superclass constructor
		style = "filled";
	}

	double area() {
		return getWidth() * getHeight() / 2;
	}

	void showStyle() {
		System.out.println("Triangle is " + style);
	}
}

// Extend Triangle.
class ColorTriangle extends Triangle {
	private String color;

	ColorTriangle() {
		super();
		color = "No Color";
	}
	
	ColorTriangle(double x) {
		super(x);
		color = "No Color";
	}
	
	ColorTriangle(String c, String s, double w, double h) {
		super(s, w, h);
		color = c;
	}

	String getColor() {
		return color;
	}

	void showColor() {
		System.out.println("Color is " + color);
	}
}

class ShapesInhiritanceDemo {
	public static void main(String args[]) {
		Triangle t1 = new ColorTriangle();
		Triangle t2 = new ColorTriangle("Blue", "outlined", 8.0, 12.0);
		Triangle t3 = new ColorTriangle(4.0);
		// t1 = t2;
		System.out.println("Info for t1: ");
		t1.showStyle();
		t1.showDim();
		System.out.println("Area is " + t1.area());
		System.out.println();
		System.out.println("Info for t2: ");
		t2.showStyle();
		t2.showDim();
		System.out.println("Area is " + t2.area());
		System.out.println();
		System.out.println("Info for t3: ");
		t3.showStyle();
		t3.showDim();
		System.out.println("Area is " + t3.area());
		System.out.println();		
	}
}