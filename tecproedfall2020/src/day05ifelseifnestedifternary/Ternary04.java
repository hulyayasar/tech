package day05ifelseifnestedifternary;

import java.util.Scanner;

public class Ternary04 {

	public static void main(String[] args) {
		// Ask user to enter an integer. If the number has 3 digits, output will be
		//“This number has 3 digits.” Otherwise, output will be “This number has no 3 digits.”
		//How can you decide the number of digits of an integer?

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an intger");
		int num1 = scan.nextInt();
		
		System.out.println((num1>=99 && num1%100<=1000) || (num1<=-99 && num1%100>=-1000) ? "This number has 3 digits" : "This number has no 3 digits.");
		
		scan.close();
	}

}
