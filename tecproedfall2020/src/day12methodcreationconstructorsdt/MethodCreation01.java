package day12methodcreationconstructorsdt;

public class MethodCreation01 {

	public static void main(String[] args) {
		add(3,5);
		add(33.5,5.6);
		add(6,7.8);

	}
	
	public static void add(int num1,int num2) {
		System.out.println(num1+num2 );
	}
	public static void add(double num1,double num2) {
		System.out.println(num1+num2);
	}
public static void add(int num1,double num2) {
	System.out.println(num1+num2);
	}

}
