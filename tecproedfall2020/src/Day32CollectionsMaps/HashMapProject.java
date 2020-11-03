package Day32CollectionsMaps;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapProject {

	
	public static void main(String[] args) {
		HashMap<Integer,String> hm1 = new HashMap<>();
		
		saveInfo(hm1);
		getInfo(hm1);
		remove(hm1);

	}
	
	public static void saveInfo(HashMap<Integer,String> hm1) {
		Scanner scan = new Scanner(System.in);
		
		String ssn="";
		do {
			System.out.println("Enter your ssn(9digit)");
			System.out.println("please enter Q for exit");
			ssn=scan.nextLine();
			if(ssn.equalsIgnoreCase("Q")) {
				break;
			}
			
			int num = Integer.parseInt(ssn);
			if(hm1.containsKey(num)) {
				System.out.println("you are trying to put same ssn . please enter a new ssn");
				continue;
			}
			System.out.println("Enter your full name");
			String name = scan.nextLine();
			System.out.println("Enter your full address");
			String  address= scan.nextLine();
			System.out.println("Enter your phone number");
			String phonenum= scan.nextLine();
				
			String value = "Name: " + name + "\naddress: " + address + "\nphone number: " + phonenum;
			hm1.put(num, value);
				
				
		}while(true);
		System.out.println(hm1);
		scan.close();
	}
	
	public static void getInfo(HashMap<Integer,String> hm1) {
		Scanner scan = new Scanner(System.in);
		String ssn="";
		do {
			System.out.println("Enter SSN to get the informations");
			System.out.println("please enter Q for exit");
			ssn=scan.nextLine();
			if(ssn.equalsIgnoreCase("Q")) {
				break;
			}
			else if(hm1.isEmpty()) {
				System.out.println("There is no any data to remove");
				break;
			}
			int num = Integer.parseInt(ssn);
			if(!hm1.containsKey(num)) {
				System.out.println("The SSN number which you entered is not exist");
				continue;
			}
			
			System.out.println(hm1.get(num));
			
		}while(true);
		scan.close();
	}
	
	public static void remove(HashMap<Integer,String> hm1) {
		Scanner scan = new Scanner(System.in);
		String ssn="";
		do {
			System.out.println("Enter SSN to remove");
			System.out.println("please enter Q for exit");
			ssn=scan.nextLine();
			if(ssn.equalsIgnoreCase("Q")) {
				break;
			}
			else if(hm1.isEmpty()) {
				System.out.println("There is no any data to remove");
				break;
			}
			int num = Integer.parseInt(ssn);
			if(!hm1.containsKey(num)) {
				System.out.println("The SSN number which you entered is not exist");
				continue;
			}
			
			String removed = hm1.remove(num);
			
			System.out.println("Removed number is: " + removed);
			
			
		}while(true);
		System.out.println(hm1);
		scan.close();
	}
	
	public static void select(HashMap<Integer,String> hm1) {
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("Select option (1-2-3)");
			System.out.println("1: Add data\n2: Get data\n3: Delete data");
			System.out.println("please enter Q for exit");
			String option=scan.nextLine();
			if(option.equalsIgnoreCase("Q")) {
				break;
			}
			switch(option) {
			case "1":
				saveInfo(hm1);
			break;
			case "2":
				remove(hm1);
			break;
			case "3":
				select(hm1);
				break;
			
			}
			System.out.println();
		}while(true);
		scan.close();
		
	}

}
