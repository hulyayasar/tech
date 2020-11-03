package day11doWhilemethodCreationdt;

import java.util.Scanner;

public class DoWhile02 {

	public static void main(String[] args) {
		/*
		 Ask user to enter his/her first name
		 If the initial is lower case print a message like “Make the initial upper case”
		 If the initial is upper case print a message like “You did it right”
		 */
		Scanner scan = new Scanner(System.in);
		char name='a';
		
		do{
			System.out.println("Enter your first name");
			name= scan.next().charAt(0);
			if(name>='a' && name<='z') {
				System.out.println("Make the initial upper case");
			}
			else {
				System.out.println("You did it right");
			}
			
		}while(name>='a' && name<='z');
		
		
		scan.close();
	}

}
