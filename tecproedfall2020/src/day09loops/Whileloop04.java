package day09loops;

import java.util.Scanner;

public class Whileloop04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a positive integer");
        int num1 = scan.nextInt();
        
        int sum=0;
        while(num1>0) {
        	
        	sum= sum +(num1%10);
        	num1=num1/10;
        	
        }
        System.out.println(sum);
        scan.close();

	}

}
