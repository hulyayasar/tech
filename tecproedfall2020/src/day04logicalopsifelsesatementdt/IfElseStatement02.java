package day04logicalopsifelsesatementdt;

import java.util.Scanner;

public class IfElseStatement02 {

	public static void main(String[] args) {
		//JavaLearner  The password is true    The password is false
		/*
		 "==" can be used for primitive data types. If i used for non-primitive ones
		  sometimes it gives correct result sometimes it gives wrong result
		  Because of that we do not use"==" for strings' we use "equals() method.
		 */
		Scanner scan = new Scanner(System.in);
		String pasw =scan.nextLine();
		if(pasw.equals("JavaLearner")) {
			System.out.println("The password is true ");
		}
		else {
			System.out.println("The password is false ");
		}
		
		scan.close();
	}

}
