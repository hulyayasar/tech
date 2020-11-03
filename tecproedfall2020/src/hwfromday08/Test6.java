package hwfromday08;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		/*
		 Ask user to enter a String and output will be the number of the characters in the String.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = scan.nextLine();
		
		System.out.println(str.length());
		scan.close();
	}

}
