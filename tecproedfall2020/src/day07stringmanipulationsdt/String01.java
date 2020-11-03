package day07stringmanipulationsdt;

public class String01 {

	public static void main(String[] args) {
		
		String s1 = "Java";
		String s2 = "is easy";
		
		//1.charAt()
		System.out.println(s1.charAt(0));
		System.out.println(s1.charAt(2));
		System.out.println(s1.charAt(s1.length()-1));
		System.out.println("-------------------");
		
		//2.concat()
		System.out.println(s2.concat(s1));
		System.out.println("-------------------");
		
		//3.contains()
		System.out.println(s2.contains("easy"));
		System.out.println(s2.contains("e"));
		System.out.println(s2.contains("IS"));
		System.out.println(s2.contains(" "));
		System.out.println("-------------------");
		
		//4.endsWith()
		System.out.println(s2.endsWith("m"));
		System.out.println(s2.endsWith(""));
		System.out.println("-------------------");
		
		//5.equals()
		System.out.println(s2.equals(s1));
		System.out.println(s1.contains("Java"));
		System.out.println(s1.equals(s1));
		System.out.println(s1.contains("JAVA"));
		System.out.println("-------------------");
		
		//6.equalsIgnoreCase()
		System.out.println(s1.equalsIgnoreCase("JAVA"));
		System.out.println("-------------------");
		
		//7.indexOf() method returns the index of first occurrence of a specific char
		System.out.println(s1.indexOf('a'));
		String s3 = "Java is easy and easy";
		
		System.out.println(s3.indexOf('s')); //First indexOf method
		System.out.println(s3.indexOf("easy"));//Second indexOf method
		System.out.println(s3.indexOf('a', 5));//Third indexOf method
		System.out.println(s3.indexOf("easy", 9));//Forth indexOf method
		System.out.println(s3.indexOf('x'));
		System.out.println("-------------------");
		
		//8.isEmpty()
		String s4 = "Study hard study hard";
		String s5 = "";
		System.out.println(s4.isEmpty());
		System.out.println(s5.isEmpty());
		System.out.println("-------------------");
		
		//9.lastIndexOf()
		System.out.println(s4.lastIndexOf("u"));
		System.out.println(s4.lastIndexOf("hard"));
		System.out.println(s4.lastIndexOf('d', 7));
		System.out.println(s4.lastIndexOf("udy", 3));
		System.out.println("-------------------");
		
		//10.length()
		String s6 = "Study hard, stay humble";
		System.out.println(s6.length());
		System.out.println("-------------------");
		
		//11.replace()
		System.out.println(s6.replace('h', 'c'));
		System.out.println(s6.replace("h", "c"));
		System.out.println(s6.replace("h", ""));
		System.out.println(s6.replace("x", "!"));
		System.out.println(s6);
		System.out.println(s6.replace("", "!"));
		System.out.println("-------------------");
		
		//12.startsWith()
		String s7 = "Learn Java earn money";
		System.out.println(s7.startsWith("L"));//first one
		System.out.println(s7.startsWith(""));
		
		System.out.println(s7.startsWith("J",6));//second one
		System.out.println(s7.startsWith("e",10));
		
		
		
		
	}

}
