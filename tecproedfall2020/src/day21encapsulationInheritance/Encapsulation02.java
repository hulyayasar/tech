package day21encapsulationInheritance;

public class Encapsulation02 {

	public static void main(String[] args) {
		Encapsulation01 obj = new Encapsulation01();
		System.out.println(obj.getCollageName());//FIU
		
		obj.setCollageName("UNF");
		System.out.println(obj.getCollageName());//UNF
		
		Students std1=new Students();
		System.out.println(std1.getaddress());
		System.out.println(std1.getname());
		System.out.println(std1.getssn());
		
		Students std2=new Students();
		std2.setaddress("Piscataway, NewJersey");
		std2.setname("Ayse Han");
		std2.setssn("987654321");
		
		System.out.println(std2.getaddress());
		System.out.println(std2.getname());
		System.out.println(std2.getssn());
	}

}
