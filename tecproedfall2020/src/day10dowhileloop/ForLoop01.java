package day10dowhileloop;

import java.util.Scanner;

public class ForLoop01 {

	public static void main(String[] args) {
		
		/*
		1)Create package, name it as "day10dowhileloop"
		2)Create a class, name it as "ForLoop01"
		3)Ask user to enter a String
		4)Print the number of "letters" and 
		number of "digits" in the String on the console
		For example: "1?ab!23_cd" ==> Number of letters: 4
		==> Number of digits: 3
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String");
        String str = scan.nextLine();
        
        int leco =0;
        int dico =0;
        
        for(int i=0;i<str.length();i++) {
        	if(str.charAt(i)>='a' && str.charAt(i)<='z' || str.charAt(i)>='A' && str.charAt(i)<='Z' ) {
        		leco++;
        	}
        	if(str.charAt(i)>='0' && str.charAt(i)<='9' ) {
        		dico++;
        	}
        	
        }
        System.out.println("number of letters" +leco);
        System.out.println("number of digits" + dico);
        
        scan.close();
        
        
        /*String str2 =str;
        str = str.replace("//d", "").replace("//W", "");
        
        System.out.println("number of letters is " + str.length());
        
        str2=str2.replace("//D", "");
        System.out.println("number of digits is " +str2.length());
        */
        
        




	}

}
