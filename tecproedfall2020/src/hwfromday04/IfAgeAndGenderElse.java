package hwfromday04;

import java.util.Scanner;

public class IfAgeAndGenderElse {

	public static void main(String[] args) {
		System.out.println("Enter your age");
		Scanner scan = new Scanner(System.in);
		int age = scan.nextInt();
		
		System.out.println("Enter your gender");
		String gender = scan.next();
		
		if(age>65 && gender.equals("male")) {
			System.out.println("Hey man you retired!");
		}
		else {
			System.out.println("No need to work");
		}
		
		scan.close();
	}

}
