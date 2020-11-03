package day12methodcreationconstructorsdt;

public class Car {
	
	//instance variables
	int price;
	String make;
	String model;
	int year;
	String color;
	String engine;
	int milage;
	boolean isGas;
	
	public Car() {
		
	}

	public Car(int price,String make,String model,int year) {
		
		this.price = price;
		this.make = make;
		this.model = model;
		this.year = year;
		
	}
	
	public static void main(String[] args) {
		Car car1 = new Car();
		System.out.println(car1.price);
		System.out.println(car1.isGas);
		
		Car car2 = new Car(20000,"Audi","R8",2018);
		System.out.println(car2.price);
		System.out.println(car2.make);
		System.out.println(car2.model);
		System.out.println(car2.year);
		
	}

}
