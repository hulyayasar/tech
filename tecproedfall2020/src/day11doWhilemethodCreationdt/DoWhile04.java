package day11doWhilemethodCreationdt;

import java.util.Scanner;

public class DoWhile04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Type java code by using while loop,
		//Write a program that prompts the user to input an integer.
		//It should then find sum of the digits of that number.
		/*
		 Ask user to enter a name.		
If the name contains the letter ‘a’ then print “Won!” on the console
otherwise ask user to enter another name.
Use do-while loop.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		String name= "";
		
		do {
			System.out.println("Enter a name");
			name = scan.nextLine();
			
		
		}while(!name.contains("a"));
		
		System.out.println("Won!");
		
		scan.close();
	}

}
