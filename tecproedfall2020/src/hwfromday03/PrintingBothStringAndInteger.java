package hwfromday03;

public class PrintingBothStringAndInteger {

	public static void main(String[] args) {
		//study hard , study 5 , hard23 , hard1
		//61 study-1
		int numA = 2;
		int numB = 3;
		String str1 = "Study";
		String str2 = "Hard";
		
		System.out.println(str1 + str2);
		System.out.println(str1 + (numA+numB));
		System.out.println(str2 + numA + numB);
		System.out.println(str2 + (numB-numA));
		
		System.out.println((numA*numB) + "" + (numB-numA) + " " + str1 + "-" + (numB-numA));

	}

}
