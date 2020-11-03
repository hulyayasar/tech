package hwfromday09;

import java.util.Scanner;

public class E5Fibonacci {

	public static void main(String[] args) {
		
		//Write a program to print Fibonacci series of n terms where n is input by user :
		//	0 1 1 2 3 5 8 13 24 ..... 
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a positive integer");
        int num = scan.nextInt();
        
        if(num==1) {
        	System.out.print("0");
        }
        else if(num==2){
        	System.out.print("0 1");
        }
        else if(num==3){
        	System.out.print("0 1 1");
        }
        else if(num>3) {
        	System.out.print("0 1 1");
        	int a=1,b=1,res=0;
        	for(int i=3;i<=num;i++) {
        		res=a+b;
        		System.out.print(" " + res);
        		a=b;
        		b=res;
        	}
        	
        }
        else {
        	System.out.println("Enter a valid number");
        }
        
        scan.close();

	}

}
