package Day32CollectionsMaps;

import java.util.HashMap;

public class HashMap01 {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hm1 = new HashMap<>();
		
		hm1.put(101, "Milk");
		hm1.put(102, "Cheese");
		hm1.put(103, "Meat");
		hm1.put(100, "Butter");
		hm1.put(107, "Honey");
		hm1.put(108, "Pastirami");
		hm1.put(101, "M");
		hm1.put(null, "nth");
		hm1.put(10001,null);
		hm1.put(10002,null);
		System.out.println(hm1);

		System.out.println(hm1.get(101));
		System.out.println(hm1.get(200));//null
		
		System.out.println(hm1.getOrDefault(200, "The product you are looking for does not exist"));
		
		System.out.println(hm1.values());
		System.out.println(hm1.keySet());
		System.out.println(hm1.containsValue("Orange"));
		System.out.println(hm1.containsKey(200));
		
		hm1.putIfAbsent(200, "AAA");
		System.out.println(hm1);
		
		System.out.println(hm1.replace(103, "Olive"));
		System.out.println(hm1);
		
		HashMap<Integer,String> hm2 = new HashMap<>();
		hm2.put(301, "A");
		hm2.put(302, "B");
		hm1.putAll(hm2);
		
		System.out.println(hm1);
		
		
	}

}
