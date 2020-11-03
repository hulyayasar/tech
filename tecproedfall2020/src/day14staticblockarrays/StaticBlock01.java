package day14staticblockarrays;

public class StaticBlock01 {
	
	/*
	 1)Static Block is a code block, it is used to initialize "class variables"
	 2)Static Block runs before everything inside the class
	 */
	
	static double pi;//0
	static String shape;
	
	static {
		pi=3.14;
		shape="Circle";
	}
	
	static {
		shape="Circle";
	}

	public static void main(String[] args) {
		System.out.println(areaCircle(10));

	}
	
	public static double areaCircle(double r) {
		return pi * r * r;
	}
	
	public static double perimeterCircle(double r) {
		return 2 * pi * r;
	}

}
