package day13ConstructorsStaticKeyword;

public class MyClass {
	
	int x=3;
	int y = 5;

	public MyClass() {
		x+=1;
		System.out.print("-x" + x);
	}
	
	public MyClass(int i) {
		this();
		this.y=i;
		x+=y;
		System.out.print("-x" + x);
	}
	
	public MyClass(int i, int i2) {
		this(3);
		this.x-=4;
		System.out.print("-x" + x);
	}
	public static void main(String[] args) {
		//MyClass mc1 = new MyClass(4,3);
		
		

	}

}
