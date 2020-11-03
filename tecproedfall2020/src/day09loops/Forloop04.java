package day09loops;

import java.util.Scanner;

public class Forloop04 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a beginning and ending integers");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int sum=0;
        
        if(num1<num2) {
        	for(int i =num1 ; i<=num2; i++) {
			
        		sum=sum + i;
			
        	}
        }
        else {
        	for(int i =num2 ; i<=num1; i++) {
    			
        		sum=sum + i;
			
        	}
        }
		System.out.println(sum);

		scan.close();
	}

}
