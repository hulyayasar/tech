package hwfromday05;

import java.util.Scanner;

public class IfStringIsTwoChar {

	public static void main(String[] args) {
		//Ask user to enter a String.
		//If the String has 2 characters, output will be  “It is valid for state abbreviations”
		//Otherwise, output will be “It is not valid for state abbreviations”

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = scan.nextLine();
		
		if(str.length() == 2) {
			System.out.println("It is valid for state abbreviations");
		}
		else {
			System.out.println("It is not valid for state abbreviations");
		}
		
		scan.close();
	}

}
