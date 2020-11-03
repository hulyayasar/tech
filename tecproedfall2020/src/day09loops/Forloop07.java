package day09loops;

import java.util.Scanner;

public class Forloop07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a positive integer");
        int num1 = scan.nextInt();
        
        for(int i=num1; i>0; i--) {
        	for(int h=0; h<num1-i; h++) {
        		System.out.print(" ");
        	}
        	for(int j=num1; j>num1-i; j--) {
        		System.out.print("* ");
        	}
        	
        	System.out.println();
        }
        
        scan.close();
	}

}
