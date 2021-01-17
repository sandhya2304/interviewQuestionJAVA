package sunday17;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicate {

	public static void main(String[] args) {
	
		ArrayList<String> al = new ArrayList<>();
		al.add("orange");
		al.add("orange");
		al.add("orange");
		al.add("kiwi");
		al.add("mango");
		
        System.out.println("duplicate : "+al);
        
        HashSet<String> set = new HashSet<>(al);
        System.out.println("no duplicate : "+set);
		
	}

}
