package day13ConstructorsStaticKeyword;

public class Static01 {
	
	/*
	 if you use static keyword for an instance variable, then it is called   "class variable"
	 "age" is instance(object) variable , "height" is "class variable"
	 */
	int age = 23;
	static int height = 6;

	public static void main(String[] args) {
		System.out.println(Static01.height);
		System.out.println(height);

	}
	
	public static void add(int n1, int n2) {
		System.out.println(n1+n2);
	}
	
	public void subtract(int n1, int n2) {
		System.out.println(n1-n2);
	}

}
