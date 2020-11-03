package day09loops;

import java.util.Scanner;

public class Forloop05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a positive integer");
        int num1 = scan.nextInt();
        int res =1;
        
        if(num1<0) {
        	System.out.println("Factorial does not works with negative numbers");
        }
        else if(num1==0) {
        	System.out.println(num1 + "!= 1");
        }
        else {
        	for(int i=1; i<=num1; i++) {
        		res=res*i;
        	}
        	System.out.println(num1 + "!= " + res);
       
        }
        scan.close();
	}

}
