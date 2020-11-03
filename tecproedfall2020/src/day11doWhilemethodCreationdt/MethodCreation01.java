package day11doWhilemethodCreationdt;

public class MethodCreation01 {
	
	/*
	 Create a method which adds two numbers.
	 Call the method from the main method.
	 */

	public static void main(String[] args) {
		
		add(3.0,4);
		add(13,2.3);
		
		add(23,56,70);
		
		mult(1,2,3);
		System.out.println(div(10,2));
		System.out.println(sub(4,6));
		
	}
	
	/*
	 if you create methods with the same name by changing parameters,
	 it called "Method Overloading"
	 */

	public static void add(double num1,double num2) {
		
		System.out.println(num1+num2);
		
	}
	
	public static void add(double num1,double num2,double num3) {
		
		System.out.println(num1+num2+num3);
		
	}
	public static void mult(double num1,double num2,double num3) {
		
		System.out.println(num1*num2*num3);
		
	}
	
	public static double div(double num1,double num2) {

		return num1/num2;
	}
	public static double sub(double num1,double num2) {
		double res= num1-num2;
		if(num1>num2)
		return res;
		else
			return -1*res;
	}
	
	
}
