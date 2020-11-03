package hwfromday07;

public class StringManipulation {

	public static void main(String[] args) {
		
		String s1 = "I love coding";
		String s2 = " and also Java";
		String s3 = "";
		System.out.println(s1.charAt(4)); //v
		System.out.println("----------");

		System.out.println(s1.concat(s2));//I love coding and also Java
		System.out.println("----------");
		
		System.out.println(s1.endsWith("g"));//true
		System.out.println(s1.endsWith("a"));//false
		System.out.println(s2.endsWith("Java"));//true
		System.out.println(s2.endsWith("ing"));//false
		System.out.println("----------");
		
		System.out.println(s1.equals(s2));//false
		System.out.println(s1.equals("I love coding"));//true
		System.out.println("----------");
		
		System.out.println(s1.equalsIgnoreCase(s2));//false
		System.out.println(s1.equalsIgnoreCase("I love CODING"));//true
		System.out.println("----------");
		
		System.out.println(s1.indexOf('c'));//7
		System.out.println(s1.indexOf("love"));//2
		System.out.println(s1.indexOf(s1.charAt(2)));//2
		System.out.println(s1.concat(s2).indexOf(s2));//13
		System.out.println(s1.indexOf('g', 3));//12
		System.out.println(s1.concat(s2).indexOf('o', s1.concat(s2).indexOf(s2)));//21
		System.out.println("----------");
		
		System.out.println(s1.isEmpty());//false
		System.out.println(s3.isEmpty());//true
		System.out.println("----------");
		
		System.out.println(s1.lastIndexOf("o"));//8
		System.out.println(s1.lastIndexOf("ing"));//10
		System.out.println(s2.lastIndexOf('a', 5));//5
		System.out.println("----------");
		
		System.out.println(s1.concat(s2).length());//27
		System.out.println("----------");
		
		System.out.println(s1.startsWith("I"));//true
		System.out.println("----------");
		
		System.out.println(s1.replace(" ", "space"));//Ispacelovespacecoding
		System.out.println("----------");
		
		
		
		
	}
	

}
