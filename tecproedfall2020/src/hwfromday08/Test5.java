package hwfromday08;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		/*
		 Ask user to enter a word which has 4 letters and output will be inverse of the word.
		  For example; if user enters “MARK” output will be “KRAM”
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a word which has 4 letters");
		String word = scan.nextLine();
		
		if(word.length()==4) {
			System.out.println(word.charAt(3)+"" + word.charAt(2)+"" + word.charAt(1)+"" + word.charAt(0));
		}
		else {
			System.out.println("Enter a valid word");
		}
		scan.close();
	}

}
