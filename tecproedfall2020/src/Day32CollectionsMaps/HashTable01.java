package Day32CollectionsMaps;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashTable01 {

	public static void main(String[] args) {
		Hashtable<String, Integer> ht1 = new Hashtable<>();
		ht1.put("Ali Can", 23);
		ht1.put("Veli Han", 23);
		ht1.put("Kemal Ay", 23);
		ht1.put("Canan Can", 23);
		ht1.put("Angie Star", 23);
		System.out.println(ht1);
		
		//entrySet() method displays the map elements in a Set.
				Set<Entry<String, Integer>> s1 = ht1.entrySet();
				
				Iterator<Entry<String, Integer>> it1 = s1.iterator();
				while(it1.hasNext()) {
					Object el = it1.next();
					System.out.print(el + " * ");
				}

		

	}

}
