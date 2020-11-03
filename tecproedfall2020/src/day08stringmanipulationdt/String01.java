package day08stringmanipulationdt;

public class String01 {

	public static void main(String[] args) {
		//13.substring()
		String s1 = "Java is Java";
		System.out.println(s1.substring(3));
		System.out.println(s1.substring(5));
		System.out.println(s1.substring(s1.length()-1));
		System.out.println(s1.substring(12));
		System.out.println(s1.substring(0));
		
		System.out.println(s1.substring(2, 7));
		System.out.println(s1.substring(5, 10));
		System.out.println(s1.substring(5, 5));
		System.out.println("---------------");
		
		// it will give me run time error
		//System.out.println(s1.substring(5, "2"));
		
		// it will give me compile time error
		//System.out.println(s1.substring(5, 2));
		
		//14.toLowerCase()
		String s2 = "Teach more learn more";
		System.out.println(s2.toLowerCase());
		System.out.println("---------------");
		
		//15.toUpperCase()
		System.out.println(s2.toUpperCase());
		System.out.println("---------------");
		
		System.out.println(s2.substring(0, 5).toUpperCase() + s2.substring(5));
		
		System.out.println(s2.substring(0,6)  +s2.substring(6,10).toUpperCase() + 
						   s2.substring(10,17) + s2.substring(17).toUpperCase());
		
		//16.trim()
		String s3 = "   Java is a programming language   ";
		System.out.println(s3);
		System.out.println(s3.trim());
		
		
	}

}
