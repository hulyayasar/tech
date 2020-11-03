package hwfromday04;

import java.util.Scanner;

public class If18btw65else {

	public static void main(String[] args) {
		System.out.println("Enter your age");
		Scanner scan = new Scanner(System.in);
		int age = scan.nextInt();
		
		if(age>18 && age<65) {
			System.out.println("You should work");
		}
		else {
			System.out.println("No need to work");
		}

		scan.close();
	}

}
