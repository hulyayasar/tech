package day13ConstructorsStaticKeyword;

public class Static02 {

	public static void main(String[] args) {
		
		Static01 obj1 = new Static01();
		System.out.println(obj1.age);
		
		//not  to use object for static things 
		//obj1.add(12, 11);
		
		obj1.subtract(11, 3);
		
		System.out.println(Static01.height);
		Static01.add(4, 15);
		
		Static01 obj2 = new Static01();
		
		Static01.height++;
		//System.out.println(obj1.height);//7
		//System.out.println(obj2.height);//7
		
		obj1.age++;
		System.out.println(obj1.age);//24
		System.out.println(obj2.age);//23
		
		
		
		
		

	}

}
