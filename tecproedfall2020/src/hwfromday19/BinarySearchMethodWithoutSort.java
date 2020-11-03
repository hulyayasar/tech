package hwfromday19;

import java.util.Arrays;

public class BinarySearchMethodWithoutSort {

	public static void main(String[] args) {
		int x[]= {1,5,7,3,9};
		int y[]= {4,3};
		
		//if an array already sorted by itself . it will show the exact result correctly
		System.out.println(Arrays.binarySearch(x, 3));
		
		//but it is not sorted array ,i should sort it before binaySearch 
		System.out.println(Arrays.binarySearch(y, 3));
		
		Arrays.sort(y);
		System.out.println(Arrays.binarySearch(y, 3));
		
		

	}
	

}
