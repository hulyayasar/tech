package day02scanner;

public class Wrapper {

	public static void main(String[] args) {
		/*
		 1)Wrapper Class contains primitive value and some methods which can be used by primitives
		 2)How to name Wrapper Class
		   ***int==> Integer
		   byte==> Byte
		   short==> Short
		   long==>Long
		   float==>Float
		   double==>Double
		   ***char==>Character
		   boolean==>Boolean
		   
		 */
		byte maxValueByte = Byte.MAX_VALUE;
		System.out.println(maxValueByte);
		
		byte minValueByte = Byte.MIN_VALUE;
		System.out.println(minValueByte);
		
		short maxValueShort = Short.MAX_VALUE;
		System.out.println(maxValueShort);
		
		short minValueShort = Short.MIN_VALUE;
		System.out.println(minValueShort);
		
		//Homework: Find the max and min values of int, long, float,double
		
		int maxValueInt = Integer.MAX_VALUE;
		System.out.println(maxValueInt);
		int minValueInt = Integer.MIN_VALUE;
		System.out.println(minValueInt);
		
		long maxValueLong = Long.MAX_VALUE;
		System.out.println(maxValueLong);
		long minValueLong = Long.MIN_VALUE;
		System.out.println(minValueLong);
		
		float maxValueFloat = Float.MAX_VALUE;
		System.out.println(maxValueFloat);
		float minValueFloat = Float.MIN_VALUE;
		System.out.println(minValueFloat);
		
		double maxValueDouble = Double.MAX_VALUE;
		System.out.println(maxValueDouble);
		double minValueDouble = Double.MIN_VALUE;
		System.out.println(minValueDouble);
		
		
	}

}
