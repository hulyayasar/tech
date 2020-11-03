package day05ifelseifnestedifternary;

import java.util.Scanner;

public class Nestedif01 {

	public static void main(String[] args) {
		//if inside if
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your gender");
		String gender = scan.nextLine();
		System.out.println("Enter your age");
		int age = scan.nextInt();
		
		if(gender.equalsIgnoreCase("male")) {
			if(age<0) {
				System.out.println("Enter a valid number");
			}
			else if(age<18) {
				System.out.println("Boy");
			}
			else {
				System.out.println("Man");
			}
		}
		else if(gender.equalsIgnoreCase("female")){
			if(age<0) {
				System.out.println("Enter a valid number");
			}
			else if(age<18) {
				System.out.println("Girl");
			}
			else {
				System.out.println("Women");
			}
		}
		else {
			System.out.println("Not defined");
		}
		
		scan.close();
	}

}
