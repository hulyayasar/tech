package day04logicalopsifelsesatementdt;

public class Logicalops {

	public static void main(String[] args) {
		/*
		 Logical operators:
		 1)And: boolean values && boolean values    like MULTIPLICATION
		 2)Or:     "      "    ||    "      "		like ADDITION
		 3)Not: ! boolean value
		 */
		
		if(5>3 && 14<45) {
			System.out.println("Good for and");
		}
		if('A'=='a' || 17<26) {
			System.out.println("Good for or");
		}
		if(!(3<2)) {
			System.out.println("Good for not");
		}
		
		
	}

}
