package thursday14;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> fruits = new ArrayList<>();
		fruits.add("apple");
		fruits.add("orange");
		fruits.add("banana");
		fruits.add("kiwi");
		fruits.add("mango");
		
		System.out.print(fruits + " before reverse ");
		
		Collections.reverse(fruits);
		
		System.out.print(fruits + " after reverse");
 
	}

}
