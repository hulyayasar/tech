package day05ifelseifnestedifternary;

import java.util.Scanner;

public class Nestedif03 {

	public static void main(String[] args) {
		/*Type java code by using nested if() statement.
Ask user to enter a password
If the initial of the password is uppercase then check if it is ‘A’ or not. If it is ‘A’ the output will be
“Valid Password” otherwise the output will be “Invalid Password”
If the initial of the password is lowercase then check if it is ‘z’ or not. If it is ‘z’ the output will be
“Valid Password” otherwise the output will be “Invalid Password”
*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your password");
		String pass = scan.next();
		
		if(pass.charAt(0)>='A' && pass.charAt(0)<='Z') {
			if(pass.charAt(0)=='A') {
				System.out.println("Valid Password");
			}
			else {
				System.out.println("Invalid Password");
			}
		}
		else if(pass.charAt(0)>='a' && pass.charAt(0)<='z') {
			if(pass.charAt(0)=='z') {
				System.out.println("Valid Password");
			}
			else {
				System.out.println("Invalid Password");
			}
		}
		else {
			System.out.println("You have to use just letters at the begining!!");
		}
		scan.close();

	}

}
