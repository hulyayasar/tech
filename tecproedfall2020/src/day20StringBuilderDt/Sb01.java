package day20StringBuilderDt;


public class Sb01 {
	/*
	 
	 1)String class is immutable, sometimes we need mutable Strings but String class cannot provide
	   mutable Strings. Because of that Java created another class which is "StringBuilder" Class.
	   When you create a String by using StringBuilder it will be mutable.
	 2)StringBuilder does not have "synchronization" feature. To be able to do synchronization Java 
	   uses "StringBuffer" class. StringBuilder and StringBuffer have almost same methods. The difference is 
	   in "synchronization" and "speed". StringBuilder is faster than StringBuffer.  

	 */

	public static void main(String[] args) {
		String str1 = "Java";
		concat(str1);
		//the reason output "Java" is Java uses pass by value and Strings are immutable
		System.out.println(str1);
		
		//how to create StringBuilder
		//1.Way:
		StringBuilder sb1 = new StringBuilder(); 				//you can create empty String
		System.out.println(sb1.capacity());
		
		//how to add String to StringBuilder
		sb1.append("Animal");
		System.out.println(sb1.capacity());//16
		System.out.println(sb1);
		
		sb1.trimToSize();
		System.out.println(sb1.capacity()); //6
		
		sb1.append("X");
		System.out.println(sb1);
		sb1.append("Y").append("ZZZZZZZZZZZZZZ"); //AnimalXYZ
		System.out.println(sb1);
		System.out.println(sb1.capacity());
		
		
		//2.Way:
		StringBuilder sb2 = new StringBuilder(10);  			//you want to create a StringBuilder'
																//its capacity will be 10 characters
		sb2.append("People");
		System.out.println(sb1.capacity());//10
		System.out.println(sb2);
		System.out.println(sb2.capacity());//10
		sb2.append("PeopleXYZTUVW");//PeopleXYZTUVW
		System.out.println(sb2);
		System.out.println(sb2.capacity());//22
		
		
		//3.Way:
		StringBuilder sb3 = new StringBuilder("Learn Java!");	//if you are sure about string content use 
		//String s ="Learn Java!";														//use 3.way
		
		//if(s.equals(sb3)) {
		//	System.out.println("hey");
		//}
		
		System.out.println(sb3);
		System.out.println(sb3.capacity());//27
		
		sb3.append("X");
		System.out.println(sb3);  //Learn Java!X
		
		//how can i get the number of characters in a StringBuilder
		StringBuilder sb4 = new StringBuilder("Sleep less, life is short");
		//1.Way
		//sb4.trimToSize();					==> not recommended
		System.out.println(sb4.capacity());
		
		//2.Way
		System.out.println(sb4.length());
		
		//how to delete multiple characters from StringBuilder
		sb4.delete(10,sb4.length());
		System.out.println(sb4);
		
		//how to delete a character at a specific index 
		sb4.deleteCharAt(sb4.lastIndexOf("s"));
		System.out.println(sb4);
		
		//how to get a part of StringBuilder
		System.out.println(sb4.substring(0, 5));
		
		//how to get index of a specific character
		System.out.println(sb4.indexOf("p"));
		System.out.println(sb4.indexOf("e"));
		System.out.println(sb4.indexOf("ep"));
		System.out.println(sb4.indexOf("p"));
		
		//how to get a character at specified index
		System.out.println(sb4.charAt(0));
		
		//how to add character/s to a specified index
		sb4.insert(5, "X").insert(sb4.length()-1,"s");
		System.out.println(sb4);
		
		//how to reverse String
		sb4.reverse();
		System.out.println(sb4);
		
		//How to convert StringBuilder to String
		//toString() is returning String because of that it cannot update the StringBuilder
		//if you want to use StringBuilder as a String method chain.
		sb4.toString();
		
		
		StringBuilder sb5 = new StringBuilder("Java");
		System.out.println(sb5.length() + "-" + sb5.capacity());
		
		
		
		
		
		
		
	}
	
	public static String concat(String str) {
		return str +"X";
	}

}
