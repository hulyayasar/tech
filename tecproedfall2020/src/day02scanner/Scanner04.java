package day02scanner;

import java.util.Scanner;

public class Scanner04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your first and last name");
		String fullName = scan.nextLine();// for String we use nextLine() method
										  // if you use next(), you can get just first word in String
		System.out.println(fullName);
		
		System.out.println("Enter your address");
		String address = scan.nextLine();
		System.out.println(address);
		
		scan.close();
		

	}

}
