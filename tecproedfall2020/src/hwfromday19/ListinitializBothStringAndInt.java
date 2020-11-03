package hwfromday19;

import java.util.ArrayList;
import java.util.List;

public class ListinitializBothStringAndInt {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("e");
		//list.add(5); Compile time error
		list.add("5");
		for(String w: list ) {
			System.out.println(w);
		}
		
	}

}
