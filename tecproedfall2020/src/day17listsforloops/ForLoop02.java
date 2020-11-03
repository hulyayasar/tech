package day17listsforloops;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ForLoop02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		List<String> names = new ArrayList<>();
		
		int i=0;
		do {
			System.out.println("Enter " + (i+1)  + ". full name");
			names.add(scan.nextLine());
			i++;
		}while(i<5);
		
		System.out.println(names);
		
		List<String> initials = new ArrayList<>();
		
		for(String w : names) {
			initials.add("" + w.charAt(0) + w.charAt(w.indexOf(" ") + 1));
		}
		
		System.out.println(initials);
		
		scan.close();
		
		
		

	}

}
