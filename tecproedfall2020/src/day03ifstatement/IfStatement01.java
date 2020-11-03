package day03ifstatement;

import java.util.Scanner;

public class IfStatement01 {

	public static void main(String[] args) {
		if(5>3) {
			System.out.println("Okay");
			
		}
		int a=5%4;
		if(a==1) {
			System.out.println("It Is True");
		}
		
		/*System.out.println("Enter an integer");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		if(num%2==1) {
			System.out.println("odd");
		}
		if(num%2==0) {
			System.out.println("even");
		}*/
		
		System.out.println("Enter the lenght and width of a rectangle");
		Scanner scan = new Scanner(System.in);
		int lenght = scan.nextInt();
		int  width= scan.nextInt();
		if(lenght==width) {
			System.out.println("Square");
		}
		if(lenght!=width) {
			System.out.println("Rectangle");
		}

		scan.close();
	}

}
