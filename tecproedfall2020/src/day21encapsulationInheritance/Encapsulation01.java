package day21encapsulationInheritance;

public class Encapsulation01 {
	/*
	 1)we use "encapsulation" to hide data and method implementations.
	 
	 2)Encapsulated codes should have following characteristics:
	   a)everyone knows how to access to the encapsulated data or method
	   b)it should be used easily even the code is complicated
	   c)there should not any side effects of the code,to the rest of the application
	  
	  3)how to make encapsulation
	    a)make the access modifier "private"
	    b)Create "getter" and "setter" methods
	      "getter method" is used to read the encapsulation data
	      "setter method" is used to update the encapsulation data
	      
	  4)the advantages of encapsulation
	    a)it gives us flexibility, whenever we want we can update encapsulated data by using setter methods.
	    b)reusability , we create getter and setter methods just once and use them again and again from
	     different classes.
	   c)Maintainability, by using setter methods we can update the value whenever we want.
	   
	  5)after creating private variables, if you do not create any setter method, it means nothing will
	   be updated in the class.because of that  the class is called "immutable class"
	  
	 */

	private String collageName = "FIU";
	private int age = 23;
	private boolean old = false;
	
	public static void main(String[] args) {
		

	}

	public String getCollageName() {
		return collageName;
	}

	public void setCollageName(String collageName) {
		this.collageName = collageName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	//for boolean getter method's name starts with "is"
	public boolean isOld() {
		return old;
	}

	public void setOld(boolean old) {
		this.old = old;
	}
	
	
	

}
