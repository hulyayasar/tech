package day06nestedternaryswitch;

import java.util.Scanner;

public class NestedTernary02 {

	public static void main(String[] args) {
		//
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your password");
		String pass = scan.nextLine();
		
		
		String result =pass.length()==8 && pass.charAt(0)>='0' && pass.charAt(0)<='9' ? "The password is valid" :pass.charAt(pass.length()-1) == 'Z' ? "Not secure but acceptable" : "The password is not valid";
		
		System.out.println(result);
		
		scan.close();

	}

}
