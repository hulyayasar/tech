package day26exceptions;

public class Test {

	public static void main(String[] args) {
			Integer z=0;
			try {
				String s="abcd";
					z=Integer.parseInt(s);
					
					System.out.println("XXXX");
			}
			catch(NumberFormatException e){
				System.out.println("Good");
			}
			System.out.println(z);
			
			//When we get exception the codes after the exception inside the try block do not run but the codes
			   //outside the try block run
	}

}
