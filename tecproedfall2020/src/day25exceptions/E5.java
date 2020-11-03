package day25exceptions;

public class E5 {

	public static void main(String[] args) {
		 int arr[] = {9,8,7,6};
		 try {
			 System.out.println(arr[4]);
		 }
		 catch(ArrayIndexOutOfBoundsException e) {
			 System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
			 
			 e.printStackTrace();
		 }
	}

}
