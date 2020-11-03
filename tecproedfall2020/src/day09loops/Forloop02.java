package day09loops;

import java.util.Scanner;

public class Forloop02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string");
        String str = scan.nextLine();
        
		for(int i = str.length()-1 ; i>=0; i--) {
			
			System.out.print(str.charAt(i));
			
		}

		
		scan.close();
	}

}
