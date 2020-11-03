package day08stringmanipulationdt;

import java.util.Scanner;

public class checking {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your password");
        String pwd = scan.nextLine();
        
        if (pwd.length()< 1) {
            System.out.println("A" + "eee"+ pwd.replace(" ", "") + "**");
        }else if (pwd.length()< 2) {
            System.out.println("A" + "ee"+ pwd.replace(" ", "") + "**");
        }else if (pwd.length()<3) {
            System.out.println("A" + "e"+ pwd.replace(" ", "") + "**");
        }else {
            System.out.println("A" + pwd.replace(" ", "") + "**");
        }
        
        System.out.println("A"+ pwd.replace(" ", "") + "eee" + "**");

        scan.close();
	}

}
