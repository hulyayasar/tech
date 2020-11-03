package day09loops;

import java.util.Scanner;

public class Forloop06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a positive integer");
        int num1 = scan.nextInt();
        
        
        for(int i=1; i<=num1; i++) {
        	for(int j=num1-i; j>0 ; j--) {
        		System.out.print(" ");
        	}
        	for(int k=1 ; k<=i ; k++) {
        		System.out.print("* ");
        	
        	}
        	System.out.println();
        	
        }
        scan.close();
        
        
        
        

	}

}
