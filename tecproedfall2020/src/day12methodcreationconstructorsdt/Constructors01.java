package day12methodcreationconstructorsdt;

import java.util.Scanner;

public class Constructors01 {

	/*
	 1) Constructors are used to create objects from Classes
	 2) When you create a class, Java gives you a constructor. because Java knows 
	 classes are used to create objects.
	 3) the constructor Java gave is invisible inside the class, it is class it is called "default constructor
	 4)Syntax of constructor is "public Constructors01(){}"
	 5) a)Constructor's name must be same with the class name
	    b)Constructors do not have return type
	    c)Constructors do not have return type because of that do not mention them as a method.
	      Constructors are not methods.Constructors are constructors
	 6)when you create any constructor inside the class ,Java cancels default constructor.
	 */

	public Constructors01() {
		System.out.println("The constructor I created");
	}
	
	public Constructors01(int i) {
		System.out.println("I used the constructor with parameters");
	}
	
	public Constructors01(int num1, int num2) {
		System.out.println(num1 + num2);
	}
	
		public static void main(String[] args) {
			Scanner          scan   =   new    Scanner(System.in);
			Constructors01   obj    =   new    Constructors01();
			Constructors01   obj1    =   new    Constructors01(3);
			Constructors01   obj2    =   new    Constructors01(3,5);
			System.out.println(obj);
			System.out.println(obj1);
			System.out.println(obj2);
			
			scan.close();
		}
		
	

}
