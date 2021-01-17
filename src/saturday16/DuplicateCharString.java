package saturday16;

import java.util.HashMap;
import java.util.Set;

public class DuplicateCharString
{
	
	public static void duplicate(String input){
		  
		HashMap<Character,Integer> map = new HashMap<>();
		
		char[] arry = input.toCharArray();
		
		for(char ch : arry)
		{
			if(map.containsKey(ch)){
				map.put(ch,map.get(ch)+1);
			}else{
				map.put(ch,1);
			}
		}
		
		Set<Character> set = map.keySet();
		for(Character cc:set)
		{
			if(map.get(cc) > 1){
				System.out.println(cc+" : "+map.get(cc));
			}
		}
		
	}
	

	public static void main(String[] args) {
		duplicate("mmmonnna");

	}

}
