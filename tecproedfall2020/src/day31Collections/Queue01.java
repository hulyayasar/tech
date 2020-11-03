package day31Collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue01 {

	public static void main(String[] args) {
		Queue<String> q1 = new LinkedList<>();
		q1.add("Meat");
		q1.add("Butter");
		q1.add("Water");
		q1.add("Cheese");
		q1.add("Milk");
		System.out.println(q1);
		
		q1.remove();
		System.out.println(q1);
		
		Queue<String> q2 = new PriorityQueue<>();
		q2.add("Meat");
		q2.add("Butter");
		q2.add("Water");
		q2.add("Cheese");
		q2.add("Milk");
		System.out.println(q2);
		q1.remove();
		System.out.println(q1);//[Butter, Water, Cheese, Milk]
		
		//element() method returns the first element(head) but it does not remove the head.(copy+paste)
		System.out.println(q1.element());//Butter
		System.out.println(q1);//[Butter, Water, Cheese, Milk]
		
		//peek() method returns the first element(head) but it does not remove the head.(copy+paste)
		System.out.println(q1.peek());
		System.out.println(q1);//[Butter, Water, Cheese, Milk]
		
		q1.clear();
		System.out.println(q1);//[]

		
		//poll() retrieves and removes the head of this queue (cut+paste)
				System.out.println(q2.poll());//Butter
				System.out.println(q2);//[Cheese, Water, Meat, Milk]

		
		
		
		
	}

}
