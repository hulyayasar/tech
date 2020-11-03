package day05ifelseifnestedifternary;

import java.util.Scanner;

public class Ternary05 {

	public static void main(String[] args) {
		// Type java code by using ternary.
		//Write a program to print absolute value of an integer entered by user.

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an intger");
		int num1 = scan.nextInt();
		
		System.out.println(num1>=0? num1 : -1*num1);
		
		scan.close();
	}

}
