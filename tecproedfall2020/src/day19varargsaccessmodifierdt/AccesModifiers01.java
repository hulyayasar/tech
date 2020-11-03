package day19varargsaccessmodifierdt;

public class AccesModifiers01 {
	/*
	 1) if a class member is a  "private" , it can be seen, used, accessed just from inside the class
	    if you are in different class, "private class member" cannot be seen, used, accessed
	     
	 2) if a class member is "default",it cannot be seen, used, accessed from other packages
	 	"default" and "package private" are synonyms
	 	
	 3) if a class member is "public" , it can be accessed from everywhere, there is no any restriction
	 
	 4) if a class member is "protected", it can be accessed from package and 
	 	it can be accessed from classes in different packages if the class is child class
	 */
	
	
	
	private int privateAge =23;
	public int publicAge = 11;

	public static void main(String[] args) {
		AccesModifiers01  obj = new AccesModifiers01();
		System.out.println(obj.privateAge);

	}

}
