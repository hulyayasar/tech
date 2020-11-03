package day09loops;

import java.util.Scanner;

public class Whileloop01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a positive integer");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        
        for(int i=num1; i<=num2;i++) {
        	System.out.print(i +" ");
        }
        System.out.println(); 
        
        int i=num1;
        
        while(i<=num2) {
        	System.out.print(i +" ");
        	i++;
        }

        scan.close();
	}

}
