package hwfromday19;

public class StringCharNumberFalseEqual {

	public static void main(String[] args) {
		String s="";
		s+='a';
		s+=2;
		s+=false;
		
		if(s=="a2false") {
			System.out.println("Equal");
		}
		if(s.equals("a2false")) {
			System.out.println("Equal with method");
		}
		

	}

}
