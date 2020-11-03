package hwfromday10;

import java.util.Scanner;

public class E7FindingSinxValue {

	public static void main(String[] args) {
		/*
		Write a program to compute sinx for given x. 
		The user should supply x and a positive integer n.
		 We compute the sine of x using the series and
		  the computation should use all terms in the series up through the term involving xn

		sin x = x - x3/3! + x5/5! - x7/7! + x9/9! .......
		*/
		
		Scanner scan = new Scanner(System.in);
		double x = scan.nextDouble();
		int n = scan.nextInt();
		double upper =1;
		int fac=1;
		double res=0;
		int sign = -1;
		
		for(int g=1 ; g<=n ;g+=2 ) {
			upper =1;
			fac=1;

			for(int j=1;j<=g;j++) {
				upper= upper*x;
				fac = fac * j;
			}
			sign*=-1;
			res= res +sign*(upper/fac);
		
		}
		
		System.out.println("sin" + x +  " = " + res);
		
		scan.close();
		
		/*
  int i, j, n, fact, sign =  - 1;
  float x, p, sum = 0;

  printf("Enter the value of x : ");
  scanf("%f", &x);
  printf("Enter the value of n : ");
  scanf("%d", &n);

  for (i = 1; i <= n; i += 2)
  {
    p = 1;
    fact = 1;
    for (j = 1; j <= i; j++)
    {
      p = p * x;
      fact = fact * j;
    }
    sign =  - 1 * sign;
    sum += sign * p / fact;
  }

  printf("sin %0.2f = %f", x, sum);
		 */
		
		
	}

}
