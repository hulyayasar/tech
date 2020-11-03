package day02scanner;

public class TypeCasting {

	public static void main(String[] args) {
		//byte < short < int < long < float < double
				//1. Auto Widening: If you convert small data type to large ones there is nothing to do
				byte num1 = 12;
				short num2 =num1;
				System.out.println(num2);
				
				//2. Explicit Narrowing: If you convert large data types to small ones.
				//Java doesen't do it if you don't type small data type inside the parenthesis.
				int num3 = 14;
				byte num4 = (byte)num3;
				System.out.println(num4);
				
				int num5 = 30;
				double num6 = num5;
				System.out.println(num6);
				
				float num7 = 20.12f;
				double num8 = num7;
				System.out.println(num8);
				
				double num9 = 15.14;
				short num10 = (short)num9;
				System.out.println(num10);
				
				int num11 = 25;
				short num12 = (short)num11;
				System.out.println(num12);
				
				//float num13 = 3.23;
				double num14 = 3.23;
				System.out.println(num14);
				
				int a = -7;
				int b = 3;
				System.out.println(a/b);
				
				int c = 5;
				double d= 3;
				System.out.println(c/d);
				
				System.out.println(5f/2);
				
				System.out.println(5d/2d);
				
				

	}

}
