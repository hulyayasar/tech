package day05ifelseifnestedifternary;

import java.util.Scanner;

public class Nestedif02 {

	public static void main(String[] args) {
		/*Type java code by using nested if statement,
If a number is even then check if it is divisible by 3 or not. If it is divisible by 3 the output will be
“Perfect even number” otherwise, the output will be “Good even number.”
If the number is odd then check if it is divisible by 3 or not. If it is divisible by 3 the output will be
“Perfect odd number” otherwise, the output will be “Good odd number.”
	*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scan.nextInt();
		
		if(num%2==0) {
			if(num%3==0) {
				System.out.println("Perfect even number");
			}
			else {
				System.out.println("Good even number.");
			}
		}
		else {
			if(num%3==0) {
				System.out.println("Perfect odd number");
			}
			else {
				System.out.println("Good odd number.");
			}
		}
		scan.close();

	}

}
