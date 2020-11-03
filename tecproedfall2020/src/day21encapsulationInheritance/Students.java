package day21encapsulationInheritance;

public class Students {
	
	private String address = "Miami, Florida";
	private String name = "Ali Can";
	private String ssn = "123456789";

	public static void main(String[] args) {
		

	}
	public String getaddress() {
		return address;
	}
	public void setaddress(String address) {
		this.address=address;
	}
	
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name=name;
	}
	
	public String getssn() {
		return "*****" + ssn.substring(5);
	}
	public void setssn(String ssn) {
		this.ssn=ssn;
	}
	
	

}
