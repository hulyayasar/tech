package day05ifelseifnestedifternary;

import java.util.Scanner;

public class IfElseIf01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer to check its sign");
		int num=scan.nextInt();
		
		if(num>0) {
			System.out.println("Positive");
		}
		else if(num<0) {
			System.out.println("Negative");
		}
		else {
			System.out.println("Neutral");
		}

		scan.close();

	}

}
