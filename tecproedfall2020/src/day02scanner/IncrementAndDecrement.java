package day02scanner;

public class IncrementAndDecrement {
	public static void main(String[] args) {
		int num1 = 12;
		System.out.println(num1);
		num1 = num1 + 5;
		System.out.println(num1);
		//Increment
		// Never put a space between + and = !!!
		//1.Way to increase the value of a variable
		int num2 = 300;
		num2=num2+3;
		num2=num2+4;
		num2=num2+5;
		
		//2.Way to increase the value of a variable
		int num3 = 300;
		num3+=3;
		System.out.println(num3);
		num3+=4;
		System.out.println(num3);
		num3+=5;
		System.out.println(num3);
		
		//3.Way to increase the value of a variable by 1
		int num4 = 450;
		num4++;
		System.out.println(num4);
		++num4;
		System.out.println(num4);
		
		//Multiplication
		int num5 = 500;
		num5 *= 150;
		System.out.println(num5);
		
		//Decrement
		int num6 = 500;
		num6 =num6 - 5;
		System.out.println(num6);
		num6 -= 3;
		System.out.println(num6);
		num6--;
		System.out.println(num6);
		
		//Division
		int num7 = 600;
		num7 =num7 / 2;
		System.out.println(num7);
		num7 /= 3;
		System.out.println(num7);
		
		//Post and Pre Increment / Post and Pre Decrement
		int x = 12;
		System.out.println(x);
		x++;// post increment
		++x;// pre increment
		
		int y=15;
		System.out.println(y++); //Post Increment
		System.out.println(y);
		
		int z= 18;
		System.out.println(++z); //Pre Increment
		System.out.println(z);
		
		int w = 15;
		System.out.println(++w);
		
		int f =21;
		System.out.println(--f);
		System.out.println(f--);
		System.out.println(--f);
		
	
	}
}
