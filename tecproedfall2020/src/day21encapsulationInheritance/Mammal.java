package day21encapsulationInheritance;

public class Mammal extends Animal{
	
	public Mammal() {
		System.out.println("Mammal Constructor");
	}
	
	public Mammal(int a) {
		System.out.println("Parameterized Mammal Constructor");
	}

	public static void main(String[] args) {
		

	}
	
	public void giveBirth() {
		System.out.println("They give birth");
	}

	public void feedBaby() {
		System.out.println("They feed baby");
	}
	
	public void eat() {
		System.out.println("Mammals eat food");
	}
	
	
}
