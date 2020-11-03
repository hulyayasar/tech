package day09loops;

import java.util.Scanner;

public class Whileloop02 {

	public static void main(String[] args) {
		/*
		 Ask user to enter a name.		
If the name contains the letter ‘a’ then print “Won!” on the console
otherwise ask user to enter another name.
Use do-while loop.
		Scanner scan = new Scanner(System.in);
		
		
		do{
		System.out.println("Enter a name");
		String name = scan.nextLine();
		
		while(!name.contains("a")){
		system.out.println("Won!”);
		
		
		
	
		 */
		/*
		 Type java code by using while loop,
Write a program that prompts the user to input a positive integer.
It should then print the multiplication table of that number.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a positive integer");
        int num1 = scan.nextInt();
        int i=1;
        while(i<=10) {
        	System.out.println(num1 + "*" + i +"=" +num1*i);
        	i++;
        
        }
        scan.close();
       
	}

}
