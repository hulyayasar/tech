package day21encapsulationInheritance;

public class SimpleCalculator  {

	public static void add(double... v) {
		double sum=0;
		for(double w : v) {
			sum+=w;
		}
		System.out.println("The sum is: " + sum);
	}
	
	public static void multiply(double... v) {
		double product=1;
		for(double w : v) {
			product*=w;
		}
		System.out.println("The product is: " + product);
	}
	
	public static void divide(double... v) {
		double result=1;
		
		for(double w : v) {
			if(w==0) {
				continue;
			}
			result/=w;
		}
		System.out.println("The result is: " + result);
	}
	
	public static void subtract(double a,double b) {
		
		System.out.println("The product is: " + (a/b));
	}
	

}
