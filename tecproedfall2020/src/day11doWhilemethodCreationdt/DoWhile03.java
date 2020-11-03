package day11doWhilemethodCreationdt;

import java.util.Scanner;

public class DoWhile03 {

	public static void main(String[] args) {
		/*
		 Ask user to enter his first name
		 If the length of his first name is greater than 6 print “Long name”
		 otherwise print “Normal name” and finish the loop
		 */
		
		Scanner scan = new Scanner(System.in);
		String str = " ";
		do {
			System.out.println("Enter your first name");
			str = scan.nextLine();
			if(str.length()>6) {
				System.out.println("Long name");
			}
		
		}while(str.length()>6);
		
		System.out.println("Normal name");
		
		scan.close();

	}

}
