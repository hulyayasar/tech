package day09loops;

import java.util.Scanner;

public class String01 {

	public static void main(String[] args) {
		//Sometimes we want to remove just letters or just digits from a string
		//To make it we use Regular Expression (regex)  with replaceAll() method
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string");
        String str = scan.nextLine();
        
        //   For letters we use "\\w"
        //   "\\w" ==> It means A->Z , a->z , 0->9 , _ 
        System.out.println(str.replaceAll("\\w", ""));

        //   "\\W" ==> It means different from A->Z , a->z , 0->9 , _ 
        //   "\\W" means NOT "\\w" 
        System.out.println(str.replaceAll("\\W", ""));
        
        //  "\\d" ==> It means remove digits
        System.out.println(str.replaceAll("\\d", ""));
        System.out.println(str.replaceAll("\\d", "*"));
        
        // "\\D" ==> It means removing other than digits
        System.out.println(str.replaceAll("\\D", ""));
        
        // "\\s" ==> It means remove digit
        System.out.println(str.replaceAll("\\s", "&"));
        
        // "\\S" ==> It means removing other than space
        System.out.println(str.replaceAll("\\S", "&"));
        
        scan.close();
	}

}
