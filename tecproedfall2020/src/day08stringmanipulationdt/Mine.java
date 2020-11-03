package day08stringmanipulationdt;

import java.util.Scanner;

public class Mine {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your password");
		String pass = scan.nextLine();
		
		pass=pass.trim();
		pass=pass.replace(pass.charAt(0), 'A');
		
		
			if(pass.length()==1) {
				
				pass = pass.concat("eee**");
			}
			else if(pass.length()==2){
				pass = pass.concat("ee**");
			}
			else if(pass.length()==3){
				pass = pass.concat("e**");
			}
			else if(pass.length()>=4){
				pass = pass.concat("**");
			}
			
		
		
		System.out.println(pass);
		scan.close();

	}

}
