package day19varargsaccessmodifierdt;

public class Varargs02 {

	public static void main(String[] args) {
		concat("S");
		concat("S","t","h");
		
		
		

	}

	public static void concat(String s,String... t) {
		System.out.println(t.length);
		
	}
}
