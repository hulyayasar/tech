package day10dowhileloop;

import java.util.Scanner;

public class DoWhile03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String");
        String str = scan.nextLine();
        
        int letco=0;
        int digco=0;
        int figco=0;
        
        str=str.toLowerCase();
        
        int i=0;
        
        do {
        	boolean isletter = str.charAt(i)>='a' && str.charAt(i)<='z';
        	boolean isdigit = str.charAt(i)>='0' && str.charAt(i)<='9';
        	boolean isfigure = !isletter && !isdigit;
        	
        	if(isletter) {
        		letco++;
        	}
        	if(isdigit) {
        		digco++;
        	}
        	if (isfigure) {
        		figco++;
        	}
        	
        	i++;
        }while(i<str.length());
        
        System.out.println("inside the string there is " + letco + " letter");
        System.out.println("inside the string there is " + digco + " digit");
        System.out.println("inside the string there is " + figco + " figure");
        
        scan.close();
        
        
        
	}

}
