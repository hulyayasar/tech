package day25exceptions;

public class E04 {

	public static void main(String[] args) {
		
		String s1= "";
		System.out.println(s1.length());

		//String s2= null;
		try {
			//System.out.println(s2.length());
			
		}
		catch(NullPointerException e) {
			System.out.println(e.getMessage());
			System.out.println("The String is null object, null objects length() method does not run ");
		}
		
	}

}
