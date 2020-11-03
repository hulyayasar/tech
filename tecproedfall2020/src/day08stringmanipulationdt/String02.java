package day08stringmanipulationdt;

import java.util.Scanner;

public class String02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your first name");
		String firstname = scan.nextLine();
		System.out.println("Enter your last name");
		String lastname = scan.nextLine();
		
		
		System.out.println("Enter your security number");
		String num = scan.nextLine();
		
		System.out.println(firstname.trim().substring(0,1).toUpperCase() + firstname.trim().substring(1).toLowerCase() + " " +
				lastname.trim().substring(0,1).toUpperCase() + lastname.trim().substring(1).toLowerCase() +
					num.trim().replace(num.substring(0,num.length()-5), " *****"));
		
		scan.close();
		
		
		
		
	}

	
}


