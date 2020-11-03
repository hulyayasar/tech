package day21encapsulationInheritance;

public class NormalCalculator extends SimpleCalculator {

	public static void absolute(double a) {
		System.out.println(Math.abs(a));
	}
	
	public static void sqrRoot(double a) {
		if(a>=0) {
			System.out.println("The Square root is: " + Math.sqrt(a));
		}
		else {
			System.out.println("Square root does not run with negative numbers");
		}
		
	}

}
