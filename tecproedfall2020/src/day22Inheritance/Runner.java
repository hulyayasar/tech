package day22Inheritance;

public class Runner {

	public static void main(String[] args) {
		
		Honda h1 = new Honda();
		System.out.println(h1.gas);
		System.out.println("==========");
		Honda h2 = new Honda("Civic");
		System.out.println(h2.make);
		System.out.println("==========");
		
		Car c1 = new Car();
		System.out.println(c1.price);
		System.out.println("==========");
		Car c2 = new Car("Toyota");
		System.out.println(c2.make);
		System.out.println("==========");
		
		Vehicle v1 = new Vehicle(111);
		System.out.println(v1.price);
		System.out.println("==========");
		Vehicle v2 = new Vehicle(111);
		System.out.println(v2.price);
		System.out.println("==========");
	}

}
