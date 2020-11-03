package day05ifelseifnestedifternary;

import java.util.Scanner;

public class IfElseIf02 {

	public static void main(String[] args) {
		/*
		Type java code by using if-else if() statement,
		If age is less than 13 output will be “Should not work”,
		If age is greater than 65 output will be “Retired”,
		Otherwise; output will be “Should work”
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer to check its sign");
		int age=scan.nextInt();
		
		if(age<0) {
			System.out.println("Please enter a valid number");
		}
		else if(age<13) {
			System.out.println("Should not work");
		
		}
		else if(age<=65) {
			System.out.println("Should work");
		}
		else {
			System.out.println("Retired");
		}
		
		scan.close();
	}

}
