package hwfromday09;

import java.util.Scanner;

public class E7FindingdivNonceSUMonceSUB {

	public static void main(String[] args) {
		//Compute the natural logarithm of 2, by adding up to n terms in the series
		//1 - 1/2 + 1/3 - 1/4 + 1/5 -... 1/n
		//where n is a positive integer and input by user.
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a positive integer");
        int num = scan.nextInt();
        
        double res=0;
        int sign = -1;
        for(int i=1;i<=num;i++) {
        	res=res + ((sign*1.0)/i);
        	if(sign==1) {
        		System.out.print("1/" + i +  " + ");
        	}
        	else {
        		System.out.print("1/" + i +  " - ");
        	}
        	sign*=-1;
        }
        System.out.println("The result is: " + res);
        
        scan.close();

	}

}
