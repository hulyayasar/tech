package day09loops;

import java.util.Scanner;

public class Whileloop05 {

	public static void main(String[] args) {
		//Type java code by using while loop,
		//Write a program to count the factors of an integer which is entered by user.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a positive integer");
        int num1 = scan.nextInt();
        
        int i=1;
        System.out.print("Factors of " +  num1 + " = ");
        while(i<=num1) {
        	if(num1%i==0) {
        		
        		System.out.print( i  + "  ");
        	}
        	
        	i++;
        }
      
        
        scan.close();
 
	}

}
