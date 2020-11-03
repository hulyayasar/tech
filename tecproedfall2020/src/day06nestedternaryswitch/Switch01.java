package day06nestedternaryswitch;

import java.util.Scanner;

public class Switch01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scan.nextInt();
		
		if(num==1) {
			System.out.println("Sunday");
		}
		else if(num==2) {
			System.out.println("Monday");
		}
		else if(num==3) {
			System.out.println("Tuesday");
		}
		else if(num==4) {
			System.out.println("Wednesday");
		}
		else if(num==5) {
			System.out.println("Thursday");
		}
		else if(num==6) {
			System.out.println("Friday");
		}
		else if(num==7) {
			System.out.println("Saturday");
		}
		// i can use switch for char, String, int, short, byte
		//but i can not use  long, double, float,  boolean data types
		
		switch(num) {
		case(1):
			System.out.println("Sunday");
		break;
		case(2):
		System.out.println("Monday");
		break;
		case(3):
			System.out.println("Tuesday");
		break;
		case(4):
			System.out.println("Wednesday");
		break;
		case(5):
			System.out.println("Thursday");
		break;
		case(6):
			System.out.println("Friday");
		//break;
		case(7):
			System.out.println("Saturday");
		//break;
		//default:
			//System.out.println("Enter a valid number");
		
		}
		
		scan.close();
		
	}

}
