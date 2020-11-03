package hwfromday21;

import java.util.Arrays;
import java.util.Scanner;

public class ReturningReverseArray {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter array length,please");
		int length=scan.nextInt();
		int arr[] =new int[length];
		
		for(int i=0;i<length;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		
		System.out.println(Arrays.toString(reverseArray(arr,length)));
		scan.close();
		
	}
	
	public static int[] reverseArray(int arr[],int length) {
		
		int revarr[] =new int[length];
		for(int i=length-1;i>=0;i--) {
			revarr[length-1-i]=arr[i];
		}
		return revarr;
	}
		
		
		

	

}
