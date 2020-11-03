package hwfromday08;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		/*
		 Ask user a enter his/her first and last name. 
		 If the first name is longer output will be “First name is longer.”
		  If the length of last name is equal To the length of last name 
		  output will be “First name and last name  have same length.” 
		  Otherwise, output will be “Last name is longer”
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your first name");
		String fn = scan.nextLine();
		System.out.println("Enter your last name");
		String ln = scan.nextLine();
		
		if(fn.length()>ln.length()) {
			System.out.println("First name is longer.");
		}
		else if(fn.length()==ln.length()) {
			System.out.println("First name and last name  have same length.");
		}
		else {
			System.out.println("Last name is longer");
		}

		scan.close();
	}

}
