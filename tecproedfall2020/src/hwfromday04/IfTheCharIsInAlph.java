package hwfromday04;

import java.util.Scanner;

public class IfTheCharIsInAlph {

	public static void main(String[] args) {
		System.out.println("Enter a character");
		Scanner scan = new Scanner(System.in);
		char thing = scan.next().charAt(0);
		
		if(thing>='a' && thing<='z' || thing>='A' && thing<='Z') {
			System.out.println("your charcter is in an alphabet");
		}
		else {
			System.out.println("your charcter is NOT in an alphabet");
		}
		
		scan.close();
	}

}
