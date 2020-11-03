package day28Interface;

public class Runner {

	public static void main(String[] args) {
		Honda c1 = new Honda();
		c1.move();
		c1.gas();
		c1.seat();
		c1.steerinWeel();
		c1.radio();
		c1.tire();
		c1.hood();
		c1.windowtint();
		c1.clean();
		c1.polish();
		Outside.sunroof();
		System.out.println(Outside.PRICE);
		System.out.println(Inside.PRICE);
		//System.out.println(c1.NUM);
		System.out.println(Outside.NUM);

	}

}
