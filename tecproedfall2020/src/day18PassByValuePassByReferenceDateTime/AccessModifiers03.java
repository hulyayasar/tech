package day18PassByValuePassByReferenceDateTime;

public class AccessModifiers03 {
	
	private String privateNameInPackageDay18 = "18";
	String defaultNameInPackageDay18 = "Mary";//if you do not type any access modifier, it will be default
	public String publicNameInPackageDay18 = "John";

	public static void main(String[] args) {
		AccessModifiers03  obj = new AccessModifiers03();
		System.out.println(obj.privateNameInPackageDay18);

	}

}
