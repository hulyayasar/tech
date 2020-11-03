package day22Inheritance;

public class Car extends Vehicle{

	public int price = 10;
	public String make = "Toyota";
	private int a=3;
	public Car() {
		super(5);
		System.out.println(this.price);
		System.out.println(super.price);
		System.out.println("Car no parameter");
	}
	
	public Car(String make) {
		super(7);
		System.out.println("Car with parameter");
	}
	
	public static void main(String[] args) {
		Car c1 = new Car();
				System.out.println(c1.a);
		
		
	}
}
