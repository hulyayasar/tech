package hwfromday08;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		/*
		 Ask user to enter a letter, if it is uppercase check it is before “F” or not in alphabetical order. 
		  If it is before “F” in alphabetical order output will be “ Big before F”, 
		  otherwise output will be  “Big after F.”
		   If it is lowercase check it is before “h” or not in alphabetical order. 
		    If it is before “h” in alphabetical order output will be “Small before h”, 
		    otherwise “Small after h”
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a letter");
		String letter = scan.nextLine();
		
		if(letter.toUpperCase().charAt(0) == letter.charAt(0)) {
			if(letter.charAt(0)>='A' && letter.charAt(0)<'F') {
				System.out.println(" Big before F");
			}
			else {
				System.out.println("Big after F.");
			}
		}
		else if(letter.toLowerCase().charAt(0) == letter.charAt(0)) {
			if(letter.charAt(0)>='a' && letter.charAt(0)<'h') {
				System.out.println("Small before h");
			}
			else {
				System.out.println("Small after h");
			}
		}
		else {
			System.out.println("Enter a valid letter");
		}
		
		scan.close();
	}

}
