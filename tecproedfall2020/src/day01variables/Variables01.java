package day01variables;

public class Variables01 {

	public static void main(String[] args) {
		int age = 20;
		int weight = 83;
		String firstName = "Hulya";
		boolean retired = false;
		char letter = 'j' , quesmark ='?';
		byte lenght =72;
		System.out.println(age);
		System.out.println(firstName);
		System.out.println(weight);
		System.out.println(retired);
		System.out.println(quesmark);
		System.out.println(lenght);
		//byte is used for integer values from -128(inclusive) to 127(inclusive)
		short population = 23000;
		System.out.println(population);
		//short is used for integers from -32768 to 32767
		float num = 3.2f;
		System.out.println(num);
		/*
		 i have to put f or F after float number
		 i can use 7 digits at most in decimal part
		 */
		double salary = 2345.43;
		//i don't need to put anything after double number. It is necessary for float only
		
		char hey = 'j';
		System.out.println("Java is easy");
		System.out.println(hey);
		System.out.println(salary);
		System.out.println(letter);
	}

}
