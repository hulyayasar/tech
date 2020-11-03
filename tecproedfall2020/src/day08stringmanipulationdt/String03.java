package day08stringmanipulationdt;

import java.util.Scanner;

public class String03 {

	public static void main(String[] args) {
		/*Ask user to enter password, if the password is okay for the following conditions output will be
		“Your password is created successfully.” If the password is not okay for any of the following conditions
		Output will be “Enter a new password according to the give conditions”
		1.First letter must be uppercase
		2.Last letter must be lowercase
		3.Password must contain 6 characters
*/
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your password");
		String pass = scan.nextLine();
		
		if( pass.charAt(0)>='A' &&  pass.charAt(0)>='Z'  && 
				pass.charAt(pass.length()-1)>='a' &&  pass.charAt(pass.length()-1)>='z' &&
				pass.length() == 6) {
			
				System.out.println("Enter a new password according to the give conditions");
			
		}
		else {
			System.out.println("Your password is created successfully.");
		}
		
		
		scan.close();
		
		

	}

}
