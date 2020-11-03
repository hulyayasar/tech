package day28Interface;

public interface Outside {
	
	int NUM=12;
	int PRICE = 30;

	public void tire();
	
	public void hood();
	
	public void headlight();
	
	void clean();
	
	public default void polish() {
		System.out.println("Polish the car");
	}
	
	public static void sunroof() {
		System.out.println("it has sunroof");
	}
}
