package hwfromday09;

import java.util.Scanner;

public class E6finding1divN {

	public static void main(String[] args) {
		//Write a program to calculate the sum of following series where n is input by user. 
		//1 + 1/2 + 1/3 + 1/4 + 1/5 +…………1/n 
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a positive integer");
        double num = scan.nextDouble();
        
        double sum=0;
        for(int i=1;i<=num;i++) {
        	sum= sum + (1.0/i);
        	System.out.print("1/" + i +  " + ");
        }
        System.out.println();
        System.out.println("sum of them is: " + sum);

        scan.close();
	}

}
