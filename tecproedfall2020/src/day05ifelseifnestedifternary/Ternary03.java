package day05ifelseifnestedifternary;

import java.util.Scanner;

public class Ternary03 {

	public static void main(String[] args) {
		//Type java code by using ternary and if-else. Ask user to enter two integers
		//Write a program to print the minimum one on the console.

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two intger");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		System.out.println(num1<num2?num1:num2);
		
		scan.close();
	}

}
