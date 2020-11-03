package day25exceptions;

public class E03 {

	public static void main(String[] args) {
		int a=12;
		int b=0;
		
		try {
			System.out.println(a/b);
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println("Do not try to divide by 0");
		}
		finally {
			System.out.println("Done!");
		}
		

	}
	
	

}
