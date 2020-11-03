package day09loops;

import java.util.Scanner;

public class WarmUp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string");
        String str = scan.nextLine();
        
        
        str = str.trim();
        str= str.toUpperCase();
        
        if(str.length()==3) {
        	
        	if( str.charAt(2)==str.charAt(0) ) {
        		System.out.println("Palindrome");
        	}
        	else {
        		System.out.println("Not palindrome");
        	}
        }
        else {
        	if(str.charAt(str.length()-1) == str.charAt(0)) {
        		System.out.println("Like a palindrome");
        	}
        	else {
        		System.out.println("Not like a palindrome");
        	}
        }
        
        scan.close();

	}

}
