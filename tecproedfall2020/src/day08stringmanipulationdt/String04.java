package day08stringmanipulationdt;

import java.util.Scanner;

public class String04 {

	public static void main(String[] args) {
		/*
		 Ask user to enter a password
		 1)Remove all spaces from the password
		 2)Make the first character uppercase ‘A’ 
		 3)Make the last 2 characters ‘*’
		 4)If the password has less than 6 characters add ‘e’ after the first character to make the length more than 5 
		 5)Then give the password to the user
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your password");
		String pass = scan.nextLine();
		
		pass=pass.trim();
		
		
		if(pass.length()>0) {
			if(pass.length()==1) {
				pass = "A" + "eee" + "**";
			}
			else if(pass.length()==2){
				pass = "A" + pass.substring(1,2) + "ee" + "**";
			}
			else if(pass.length()==3) {
				pass = "A" + pass.substring(1,3) + "e" + "**";
			}
			else if(pass.length()==4){
				pass = "A" + pass.substring(1,4)  + "**";
			}
			else if(pass.length()>=5){
				pass ="A" + pass.substring(1,4) + "**";
			}
			
		}
		else {
			System.out.println("Enter a valid number");
		}
		
		System.out.println(pass);
		scan.close();
		/*
		if(pass.length()!=6) {
			if(pass.length()==1) {
				pass = pass.replace(pass.substring(1, pass.length()+1) , "eeeee");
			}
			else if(pass.length()==2){
				pass = pass.replace(pass.substring(2, pass.length()+1)  , "eeee");
			}
			else if(pass.length()==3){
				pass = pass.replace(pass.substring(3, pass.length()+1)  , "eee");
			}
			else if(pass.length()==4){
				pass = pass.replace(pass.substring(4, pass.length()+1) , "ee");
			}
			else if(pass.length()==5){
				pass = pass.replace(pass.substring(5, pass.length()+1) , "e");
			}
		}
		*/
	
		
	}

}
