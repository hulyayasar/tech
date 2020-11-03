package day13ConstructorsStaticKeyword;

public class Animal {
	
	int age ;
	String name ;
	int weight ;
	boolean isCarnivorous ;
	
	
	public Animal() {
		this("Cat",25);
		this.age = 5;
		System.out.println("Age from the constructor  without parameter: " +  age);
	}
	
	public Animal(String name, int weight) {
		this(true);
		this.name = name;
		this.weight = weight;
		System.out.println("Name and weight from the constructor with two parameters" + name + "-" + weight);
	}
	
	public Animal(boolean isCarnivorous) {
		this.isCarnivorous = isCarnivorous;
		System.out.println("Is the animal carnivorous: " + isCarnivorous);
	}
	
	public static void main(String[] args) {
		//Animal obj1 = new Animal();
		//Animal obj2 = new Animal("dog",30);
		
		
		

	}
	

	

}


