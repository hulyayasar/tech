package hwfromday02;

public class TypeCasting {

	public static void main(String[] args) {
		double numDouble = 100.235 ;
		int numInt = (int)numDouble;
		
		System.out.println(numInt);
		
		int sum = numInt + (int)numDouble;
		System.out.println(sum);
		
		sum = sum + 1;
		System.out.println(sum);
		sum+=1;
		System.out.println(sum);
		sum++;
		System.out.println(sum);
		
		sum = sum - 1;
		System.out.println(sum);
		sum -= 1;
		System.out.println(sum);
		sum--;
		System.out.println(sum);
		
		
	}

}
