package day03ifstatement;

public class Concatenation {

	public static void main(String[] args) {
		String s1 = "Java";
		String s2 = " is easy";
		System.out.println(s1+s2);

		String s3 = "2";
		int i1 = 3;
		int i2 = 4;
		
		System.out.println(s3 + i1 + i2);
		System.out.println(s3 + (i1 + i2));		
		System.out.println(i1 + i2 + s3 );
		
		int numA =2;
		int numB=3;
		String str1="Study";
		
		
		System.out.println((numA+numB) + " " + str1);
		
		System.out.println((numA*numB)+ "" +(numB-numA) + " " + str1 + "-" + (numB-numA));
		System.out.println((numB*numB*numB*numA)+(numB+numA+numA) + " " + str1 + "-" + (numB-numA));
		
		System.out.println(5>=2+3);
		System.out.println(true == false);
		
	}

}
